package fr.warzou.s1.tp4;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++)
            array[i] = i;
        swap(array, 1, 5);
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int from, int to) {
        if (from < 0 || from >= array.length)
            throw new IndexOutOfBoundsException("from var (" + from + ") is not between 0 and " + (array.length - 1));
        if (to < 0 || to >= array.length)
            throw new IndexOutOfBoundsException("to var (" + to + ") is not between 0 and " + (array.length - 1));

        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

}
