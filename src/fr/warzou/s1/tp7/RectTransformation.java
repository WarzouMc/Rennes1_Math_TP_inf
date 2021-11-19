package fr.warzou.s1.tp7;

import java.util.Arrays;

public class RectTransformation {

    private static int[][] sum(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    private static int[][] horizontaleSymmetric(int[][] array) {
        int[][] result = new int[array.length][array[0].length];
        int length = result.length;
        for (int i = 0; i < length; i++) {
            result[length - i - 1] = array[i];
        }
        return result;
    }

    private static int[][] verticalSymmetric(int[][] array) {
        int[][] result = new int[array.length][array[0].length];
        for (int i = 0; i < result.length; i++) {
            int rowLength = result[i].length;
            for (int j = 0; j < rowLength; j++) {
                result[i][rowLength - j - 1] = array[i][j];
            }
        }
        return result;
    }

    private static int[][] transpose(int[][] array) {
        int[][] result = new int[array[0].length][array.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array[j][i];
            }
        }

        return result;
    }

    private static int[][] rotate(int[][] array) {
        int[][] result = transpose(array);
        return horizontaleSymmetric(result);
    }

    public static void main(String[] args) {
        int[][] rect = {{1, 12, 20, 8, 17, 6, 13},
                {14, 2, 10, 21, 9, 16, 5},
                {18, 19, 3, 4, 7, 11, 15}};
        System.out.println(ArrayPrinter.deepString(horizontaleSymmetric(rect)) + '\n');
        System.out.println(ArrayPrinter.deepString(verticalSymmetric(rect)) + '\n');
        System.out.println(ArrayPrinter.deepString(transpose(rect)) + '\n');
        System.out.println(ArrayPrinter.deepString(rotate(rect)) + '\n');
    }

}
