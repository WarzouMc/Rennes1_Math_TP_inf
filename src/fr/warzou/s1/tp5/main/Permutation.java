package fr.warzou.s1.tp5.main;

import fr.warzou.s1.tp4.Occurrence;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Permutation {

    @Contract(pure = true)
    public static boolean isPermutation(int @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            if (Occurrence.count(array, i) != 1)
                return false;
        }
        return true;
    }

    public static int @NotNull [] compose(int @NotNull [] array1, int @NotNull [] array2) {
        if (array1.length != array2.length)
            throw new IllegalArgumentException("Not same arrays !");
        if (!isPermutation(array1))
            throw new IllegalArgumentException("First array is not a permutation !");
        if (!isPermutation(array2))
            throw new IllegalArgumentException("Second array is not a permutation !");

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
            result[i] = array2[array1[i]];
        return result;
    }

    @Contract(pure = true)
    public static int @NotNull [] privateCompose(int @NotNull [] array1, int[] array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
            result[i] = array2[array1[i]];
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int iterate(int[] array, int index, int count) {
        if (!isPermutation(array))
            throw new IllegalArgumentException("Array is not a permutation !");
        count = Math.abs(count);
        index = Math.abs(index);
        return privateIterate(array, index, count);
    }

    private static int privateIterate(int[] array, int index, int count) {
        System.out.println(array[index]);
        if (count == 0)
            return privateCompose(array, array)[index];
        return privateIterate(privateCompose(array, array), index, --count);
    }

    public static void main(String[] args) {
        System.out.println(isPermutation(new int[] {3, 1, 2, 6, 4, 5, 0}));
        System.out.println(isPermutation(new int[] {3, 4}));
        System.out.println(Arrays.toString(compose(new int[] {1,3,4,2,0}, new int[] {1,0,2,4,3})));

        int[] t1 = { 1, 3, 4, 2, 0 }; // permutation
		int[] t2 = { 3, 1, 4, 0, 2 }; // permutation
        System.out.println(iterate(t1, 0, 1));
        //System.out.println(iterate(t1, 0, 1));
        //System.out.println(iterate(t1, 0, 5));
		/*assertEquals(0, Exe3.itere(t1, 0, 0));
		assertEquals(1, Exe3.itere(t1, 0, 1));
		assertEquals(3, Exe3.itere(t1, 0, 2));
		assertEquals(2, Exe3.itere(t1, 0, 3));
		assertEquals(4, Exe3.itere(t1, 0, 4));
		assertEquals(0, Exe3.itere(t1, 0, 5));
		assertEquals(0, Exe3.itere(t2, 0, 0));
		assertEquals(3, Exe3.itere(t2, 0, 1));
		assertEquals(0, Exe3.itere(t2, 0, 2));*/
    }

}
