package fr.warzou.s1.tp2;

import java.util.Scanner;

public class IntSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Math.abs(scanner.nextInt());
        System.out.println((input * (input + 1) / 2));

        //fuck, with a for

        int sum = 0;
        for (int i = 0; i < input; i++)
            sum += (i + 1);
        System.out.println(sum);
    }

}
