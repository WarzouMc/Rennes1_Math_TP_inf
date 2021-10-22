package fr.warzou.s1.tp4;

import java.util.Arrays;

public class ArrayIteration {

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 1, 9, 8, 3, 4, 5, 7};
        System.out.println(Arrays.toString(move(array, new int[]{-2, 3, -1, 4}, 4)));
    }

    private static int[] move(int[] array, int[] move, int start) {
        int[] result = new int[move.length];
        for (int i = 0; i < move.length; i++) {
            start += move[i];
            if (start < 0 || start >= array.length)
                throw new ArrayIndexOutOfBoundsException("Index " + i + " (" + start + ") is not between 0 and " + (array.length - 1));

            result[i] = array[start];
        }

        return result;
    }
}
