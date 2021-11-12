package fr.warzou.s1.tp6;

public class Histogram {

    private static void draw(int count, int value) {
        System.out.println(value + " " + "*".repeat(count));
    }

    private static int countValue(int target, int[] array) {
        int count = 0;
        for (int value : array)
            count += value == target ? 1 : 0;
        return count;
    }

    public static void main(String[] args) {
        int[] array = {6, 11, 13, 16, 12, 8, 9, 7, 12, 9, 8, 10, 14, 11, 9, 1, 6, 4, 19, 17, 12, 13, 4, 0, 5, 9, 10, 11};
        for (int i = 0; i < 21; i++)
            draw(countValue(i, array), i);
    }

}
