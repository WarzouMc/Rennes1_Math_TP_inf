package fr.warzou.s1.tp7;

public final class ArrayPrinter  {

    public static String string(int[] array) {
        StringBuilder builder = new StringBuilder().append('[');
        for (int i : array)
            builder.append(i).append(", ");
        return builder.substring(0, builder.length() - 2) + ']';
    }

    public static String deepString(int[][] array) {
        StringBuilder builder = new StringBuilder().append('[');
        for (int[] sub : array)
            builder.append(string(sub)).append('\n');
        return builder.substring(0, builder.length() - 1) + ']';
    }

}
