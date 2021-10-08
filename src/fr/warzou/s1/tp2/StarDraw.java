package fr.warzou.s1.tp2;

import java.util.Scanner;

public class StarDraw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Math.abs(scanner.nextInt());
        if (height == 0)
            throw new IllegalArgumentException("Need a number > 0 !");

        shape1(height);
        System.out.println();
        shape2(height);
        System.out.println();
        shape3(height);
        System.out.println();
        shape4(height);
        System.out.println();
        shape5(height);
    }

    private static void shape1(int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++)
            builder.append("* ".repeat(height - i)).append('\n');
        System.out.println(builder.substring(0, builder.length() - 2));
    }

    private static void shape2(int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            if (i % (height - 1) == 0) {
                builder.append("* ".repeat(height)).append('\n');
                continue;
            }
            builder.append("* ").append("  ".repeat(height - 2)).append("* ").append('\n');
        }
        System.out.println(builder.substring(0, builder.length() - 2));
    }

    private static void shape3(int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            if (i % (height - 1) == 0) {
                builder.append("* ".repeat(height)).append('\n');
                continue;
            }
            builder.append("  ".repeat(height - i - 1)).append("*\n");
        }
        System.out.println(builder.substring(0, builder.length() - 2));
    }

    private static void shape4(int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++)
            builder.append("  ".repeat(height - i - 1)).append("* ".repeat(i * 2 + 1)).append('\n');
        System.out.println(builder.substring(0, builder.length() - 2));
    }

    private static void shape5(int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            if (i % (height - 1) == 0) {
                builder.append("* ").append("  ".repeat(height - 2)).append("* ").append('\n');
                continue;
            }

            builder.append("* ").append("  ".repeat(i - 1)).append("* ").append("  ".repeat(height - i - 2)).append("* \n");
        }
        System.out.println(builder.substring(0, builder.length() - 2));
    }
}
