package fr.warzou.s1.tp5.main;

import fr.warzou.s1.tp4.Swap;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Sort {

    public static int[] sort(int[] array1, int[] array2) {
        int[] array = ArrayOperation.fusion(array1, array2);
        int[] result = new int[array.length];
        int length = array.length;

        //c'est pas ça qui fallait faire je croi ...
        boolean isSort = false;
        int count = 0;
        for (int j = 0; j < length; j ++) {
            boolean tempIsSort;
            for (int i = 0; i < length - 1; i++) {
                int min = Math.min(array[i], array[i + 1]);
                tempIsSort = array[i] == min;
                if (!tempIsSort) {
                    Swap.swap(array, i, i + 1);
                    result = array;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = new int[ThreadLocalRandom.current().nextInt(10)];
        int[] array2 = new int[ThreadLocalRandom.current().nextInt(10)];

        for (int i = 0; i < array1.length; i++)
            array1[i] = ThreadLocalRandom.current().nextInt(100);

        for (int i = 0; i < array2.length; i++)
            array2[i] = ThreadLocalRandom.current().nextInt(100);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(sort(array1, array2)));
    }

}
