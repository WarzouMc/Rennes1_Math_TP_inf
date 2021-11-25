package fr.warzou.s1.tp8;

public class ToInteger {

    public static int toInt(String string) {
        int length = string.length();
        int value = 0;
        for (int i = 0; i < length; i++) {
            int integer = string.charAt(i) - '0';
            value += integer * Math.pow(10, length - i - 1);
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(toInt("123"));
    }

}
