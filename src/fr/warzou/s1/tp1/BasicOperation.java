package fr.warzou.s1.tp1;

import java.util.Scanner;

public class BasicOperation {

    public static void main(String[] args) {
        int a = readInt();
        int b = readInt();

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("2a=" + a * 2);
        System.out.println("b/2.0=" + b / 2.0);

        System.out.println("a/b=" + a / b + " ; a%b=" + a % b);

        System.out.println(Math.max(a, b) + " or " + (a >= b ? a : b));
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
