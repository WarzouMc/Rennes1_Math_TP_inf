package fr.warzou.s1.tp8;

import javax.sound.midi.Soundbank;

public class Manip {

    public static int count(String target, char c) {
        return target.replaceAll("[^" + c + "]", "").length();
    }

    public static boolean isPalindrome(String target) {
        int length = target.length();
        for (int i = 0; i < length / 2; i++) {
            if (target.charAt(i) != target.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    public static String substring(String from, int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            builder.append(from.charAt(i));
        }
        return builder.toString();
    }

    public static String replace(String string, char target, char replace) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            builder.append(c == target ? replace : c);
        }
        return builder.toString();
    }

    public static int[] toAscii(String string) {
        //pas sur
        int[] ascii = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ascii[i] = (int) string.charAt(i);
        }
        return ascii;
    }

    public static void main(String[] args) {
        System.out.println(count("boujour", 'o'));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("oaao"));
        System.out.println(isPalindrome("nop"));
        System.out.println(isPalindrome("nop"));
        System.out.println(substring("Bonjour", 2, 5));
        System.out.println(replace("gramme", 'm', 'p'));
    }

}
