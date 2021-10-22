package fr.warzou.s1.tp4;

import java.util.Arrays;

public class Mirror {

    public static void main(String[] args) {
        int[] array = new int[13];
        for (int i = 0; i < array.length; i++)
            array[i] = i;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(invertNew(array)));
        invert(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] invertNew(int[] array) {
        int[] clone = array.clone();
        for (int i = 0; i < clone.length; i++)
            clone[(clone.length - 1) - i] = array[i];
        return clone;
    }

    private static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++)
            Swap.swap(array, i, (array.length - 1) - i);
    }

}
