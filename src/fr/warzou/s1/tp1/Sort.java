package fr.warzou.s1.tp1;

public class Sort {

    public static void main(String[] args) {
        int a = BasicOperation.readInt();
        int b = BasicOperation.readInt();
        int c = BasicOperation.readInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int middle = 0;
        if ((min == a && max == b) || (max == a && min == b))
            middle = c;
        if ((min == a && max == c) || (max == a && min == c))
            middle = b;
        if ((min == c && max == b) || (max == c && min == b))
            middle = c;
        System.out.println(min + " <= " + middle + " <= " + max);
    }

}
