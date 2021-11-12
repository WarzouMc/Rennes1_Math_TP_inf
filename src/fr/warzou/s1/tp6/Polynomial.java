package fr.warzou.s1.tp6;

import java.util.Arrays;

public class Polynomial {

    private static void drawPoly(double[] coefficients) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < coefficients.length; i++) {
            double coefficient = coefficients[i];
            builder.append(coefficient);
            if (i == 0) {
                builder.append(" + ");
                continue;
            }
            if (i == 1) {
                builder.append("x + ");
                continue;
            }
            builder.append("x^").append(i).append(" + ");
        }
        System.out.println(builder.substring(0, builder.length() - 3));
    }

    private static double evaluatePoly(double[] coefficients, double of) {
        double value = 0;
        for(int i = 0; i < coefficients.length; i++) {
            double coefficient = coefficients[i];
            value += coefficient * Math.pow(of, i);
        }
        return value;
    }

    public static double[] addition(double[] poly1, double[] poly2) {
        if (poly1.length > poly2.length) {
            double[] save = poly1;
            poly1 = poly2;
            poly2 = save;
        }

        double[] addition = new double[poly2.length];
        for (int i = 0; i < addition.length; i++)
            addition[i] = (poly1.length <= i ? 0 : poly1[i]) + poly2[i];

        return addition;
    }

    public static void main(String[] args) {
        double[] poly = new double[] {5.5, 7.7, 3.3, 2.2};
        drawPoly(poly);
        System.out.println(evaluatePoly(poly, 2.0));
        System.out.println(Arrays.toString(addition(poly, new double[] {3.87, 0, 12.84})));
    }

}
