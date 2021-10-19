package fr.warzou.s1.tp3;

import javax.swing.plaf.ColorUIResource;
import java.util.Scanner;

public class StarShape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Math.abs(scanner.nextInt());
        int height = 3 * input;

        int currentLength = input;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            if (i < 4) {
                builder.append("  ".repeat(input - i)).append("* ".repeat(currentLength)).append('\n');
                currentLength += 2;
                continue;
            }
            if (i < 7) {
                builder.append("* ".repeat(currentLength)).append('\n');
                continue;
            }
            builder.append("  ".repeat(i - 7)).append("* ".repeat(currentLength)).append('\n');
            currentLength -= 2;
        }
        System.out.println(builder);
    }

}
