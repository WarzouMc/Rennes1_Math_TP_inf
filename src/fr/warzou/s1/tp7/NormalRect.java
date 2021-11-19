package fr.warzou.s1.tp7;

import java.util.Arrays;

public class NormalRect {

    private static boolean contain(int[] array, int target) {
        for (int value : array) {
            if (value == target)
                return true;
        }
        return false;
    }

    private static boolean isNormal(int[][] array) {
        if (!MagicRect.isRect(array))
            return false;

        int[] check = new int[array[0].length * array.length];
        Arrays.fill(check, -1);
        for (int[] sub : array) {
            for (int value : sub) {
                if (value - 1 >= check.length || value - 1 < 0 || check[value - 1] != -1)
                    return false;
                check[value - 1] = value;
            }
        }
        return !contain(check, -1);
    }

    public static void main(String[] args) {
        int[][] rect = {{1, 12, 20, 8, 17, 6, 13},
                {14, 2, 10, 21, 9, 16, 5},
                {18, 19, 3, 4, 7, 11, 15}};
        System.out.println(isNormal(rect));
    }

}
