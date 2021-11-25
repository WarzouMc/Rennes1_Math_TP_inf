package fr.warzou.s1.tp8;

public class UpperLowerCase {

    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char toUpperCase(char c) {
        return isUpperCase(c) ? c : (char) (c - 'a' + 'A');
    }

    public static char toLowerCase(char c) {
        return isLowerCase(c) ? c : (char) (c - 'A' + 'a');
    }

    public static String toUpperCase(String string) {
        StringBuilder upper = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            upper.append(toUpperCase(string.charAt(i)));
        }
        return upper.toString();
    }

    public static String toLowerCase(String string) {
        StringBuilder lower = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            lower.append(toLowerCase(string.charAt(i)));
        }
        return lower.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase('A'));
        System.out.println(toLowerCase('E'));
        System.out.println(toLowerCase('G'));
        System.out.println(toLowerCase('Z'));

        System.out.println(toUpperCase('a'));
        System.out.println(toUpperCase('b'));
        System.out.println(toUpperCase('z'));
        System.out.println(toUpperCase('h'));
    }

}
