package fr.warzou.s1.tp3;

import java.util.Scanner;

public class Tax {

    private final static int[] steps = {10064, 25659, 73369, 157805};
    private final static double[] valueOfStep = {0, 0.11, 0.3, 0.41, 0.45};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        System.out.println(taxUp(input));
        System.out.println(taxPercent(input));
        System.out.println(taxUp(inputA, inputB));
    }

    public static double taxUp(double from) {
        int i = 0;
        double tax = 0.0;
        while (i < steps.length) {
            if (i == steps.length - 1) {
                tax += (from - steps[i]) * valueOfStep[i];
                continue;
            }
            if (i == 0) {
                i++;
                continue;
            }
            if (steps[i - 1] < from && from <= steps[i]) {
                tax += (from - steps[i - 1]) * valueOfStep[i];
                break;
            }
            tax += (steps[i] - steps[i - 1]) * valueOfStep[i];
            i++;
        }
        return tax;
    }

    private static double taxPercent(int from) {
        double tax = taxUp(from);
        return tax/from;
    }

    private static double taxUp(int a, int b) {
        double moyenne = (a + b) / 2.0;
        return 2 * taxUp(moyenne);
    }
}
