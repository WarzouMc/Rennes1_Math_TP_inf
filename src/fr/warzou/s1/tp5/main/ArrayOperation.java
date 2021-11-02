package fr.warzou.s1.tp5.main;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ArrayOperation {

    public static void main(String[] args) {

    }

    @Contract(pure = true)
    public static Object @NotNull [] cloneArray(Object @NotNull [] array) {
        Object[] clone = new Object[array.length];
        for (int i = 0; i < array.length; i++)
            clone[i] = array[i];
        return clone;
    }

    public static Object @NotNull [] extract(Object[] array, int i, int j) {
        int temp = i;
        i = Math.min(i, j);
        j = Math.max(temp, j);
        Object[] result = new Object[j - i + 1];
        for (int k = i; k <= j; k++)
            result[k - i] = array[k];
        return result;
    }

    public static Object[] concat(Object[] array1, Object[] array2) {
        Object[] concat = new Object[array1.length + array2.length];
        for (int i = 0; i < concat.length; i++) {
            if (i < array1.length) {
                concat[i] = array1[i];
                continue;
            }
            concat[i] = array2[i - array1.length];
        }
        return concat;
    }

    public static Object[] fusion(Object[] first, Object[] second) {
        Object[] result = new Object[first.length + second.length];
        int firstCount = 0;
        int secondCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (first.length < second.length && i / 2 > first.length - 1) {
                result[i] = second[secondCount++];
                continue;
            }
            if (second.length < first.length && i / 2 > second.length - 1) {
                result[i] = first[firstCount++];
                continue;
            }
            result[i] = i % 2 == 0 ? first[firstCount++] : second[secondCount++];
        }
        return result;
    }

    public static int[] fusion(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int firstCount = 0;
        int secondCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (first.length < second.length && i / 2 > first.length - 1) {
                result[i] = second[secondCount++];
                continue;
            }
            if (second.length < first.length && i / 2 > second.length - 1) {
                result[i] = first[firstCount++];
                continue;
            }
            result[i] = i % 2 == 0 ? first[firstCount++] : second[secondCount++];
        }
        return result;
    }
}
