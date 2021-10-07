package fr.warzou.s1.tp1;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(BasicOperation.readInt()));
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
