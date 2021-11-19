package fr.warzou.s1.tp7;

import java.util.Arrays;

public class MagicRect {

    public static boolean isRect(int[][] array) {
        int targetLength = -1;
        for (int[] sub : array) {
            if (targetLength == -1) {
                targetLength = sub.length;
                continue;
            }
            if (targetLength != sub.length)
                return false;
        }
        return true;
    }

    private static boolean asSameLineSum(int[][] rect) {
        if (rect.length == 0)
            return false;
        int sum = Arrays.stream(rect[0]).sum();
        for (int[] sub : rect) {
            if (Arrays.stream(sub).sum() != sum)
                return false;
        }
        return true;
    }

    private static boolean asSameRowSum(int[][] rect) {
        if (!isRect(rect) || rect.length == 0)
            return false;
        int count = rect.length;
        boolean init = false;
        int sum = 0;
        for (int i = 0; i < rect[0].length; i++) {
            if (!init) {
                sum = sum(rect, i);
                continue;
            }
            if (sum != sum(rect, i))
                return false;
        }
        return true;
    }

    private static int sum(int[][] array, int i) {
        int sum = 0;
        for (int[] sub : array)
            sum += sub[i];
        return sum;
    }

    private static boolean isMagicRect(int[][] array) {
        return isRect(array) && asSameRowSum(array) && asSameLineSum(array);
    }

    public static void main(String[] args) {
        int[][] rect = {{1, 12, 20, 8, 17, 6, 13},
                             {14, 2, 10, 21, 9, 16, 5},
                             {18, 19, 3, 4, 7, 11, 15}};
                           // 33, 33, 33, 33
        System.out.println(isMagicRect(rect));
    }

}
