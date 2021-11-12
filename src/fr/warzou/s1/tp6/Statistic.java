package fr.warzou.s1.tp6;

import java.util.Arrays;

public class Statistic {

    private static float moyenne(int[] array) {
        int size = array.length;
        int sum = Arrays.stream(array).sum();
        return (sum + 0.0f) / size;
    }

    private static float variance(int[] array) {
        float moyenne = moyenne(array);
        int size = array.length;
        float sum = 0.0f;
        for (int value : array)
            sum += Math.pow(value - moyenne, 2);
        return sum / size;
    }

    public static void main(String[] args) {
        System.out.println(moyenne(new int[] {20, 20, 10, 0}));
        System.out.println(variance(new int[] {3, 7, 6, 18}));
    }

}
