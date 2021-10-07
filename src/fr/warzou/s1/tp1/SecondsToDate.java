package fr.warzou.s1.tp1;

import java.util.Scanner;

public class SecondsToDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextLong();
        long day = seconds /  (60 * 60 * 24);

        seconds %= 60 * 60 * 24;
        long hours = seconds / (60 * 60);

        seconds %= 60 * 60;
        long minutes = seconds / 60;

        seconds %= 60;

        System.out.println(day +  "d" + hours + "h" + minutes + "m" + seconds + "s");
        scanner.close();
    }

}
