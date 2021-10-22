package fr.warzou.s1.tp4;

import java.util.Arrays;

public class Occurrence {

    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        System.out.println(Arrays.toString(array));
        System.out.println(first(array, 3));
        System.out.println(count(array, 3));
        replace(array, 3, 93028398);
        System.out.println(Arrays.toString(array));
    }

    private static int first(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;
        return -1;
    }

    private static int count(int[] array, int target) {
        int count = 0;
        for (int j : array)
            count += j == target ? 1 : 0;
        return count;
    }

    private static void replace(int[] array, int target, int replace) {
        //with while;
        int index;
        while ((index = first(array, target)) != -1)
            array[index] = replace;
    }
}
