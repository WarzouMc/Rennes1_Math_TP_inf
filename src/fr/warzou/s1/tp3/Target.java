package fr.warzou.s1.tp3;

import java.util.Scanner;

public class Target {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Math.abs(scanner.nextInt());
        drawTarget(input);

        System.out.println();
        System.out.println(drawTargetByIteration("", input, 2 * input - 1, 1));
    }

    private static void drawTarget(int input) {
        int size = 2 * input - 1;
        for (int i = 0; i < size; i++) {
            if (i < input) {
                drawLine(i, size);
                continue;
            }
            drawLine(size - i - 1, size);
        }
    }

    private static void drawLine(int line, int size) {
        StringBuilder builder = new StringBuilder();
        int decrement = size - line;
        for(int i = 0; i < line; i++)
            builder.append((char) ('a' + i)).append(" ");
        builder.append(((char) ('a' + line) + " ").repeat(decrement - line));
        for (int i = decrement; i < size; i++)
            builder.append((char) ('a' + (decrement - 1 + line - i))).append(" ");
        System.out.println(builder);
    }

    public static String drawTargetByIteration(String current, int origin, int size, int i) {
        char targetChar = (char) ('a' + origin - i);
        String string = (targetChar + " ").repeat(2 * i - 1);
        if (i == 1)
            return drawTargetByIteration(string, origin, size, i + 1);
        String[] split = current.split("\n");
        for (int j = 0; j < split.length; j++)
            split[j] = targetChar + " " + split[j] + targetChar;

        StringBuilder builder = new StringBuilder();
        builder.append(string).append("\n");
        for (String s : split)
            builder.append(s).append(" ").append("\n");
        builder.append(string);
        return i == origin ? builder.toString() : drawTargetByIteration(builder.toString(), origin, size, i + 1);
    }
}
