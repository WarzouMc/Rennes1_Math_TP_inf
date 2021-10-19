package fr.warzou.s1.tp3;

public class Alphabet {

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++)
            System.out.println((char) ('a' + i) + " " + (char) ('Z' - i));
    }

}
