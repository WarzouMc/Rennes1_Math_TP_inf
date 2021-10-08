package fr.warzou.s1.tp2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public record GuessNumber(int toGuess) {

    public static void main(String[] args) {
        new GuessNumber(random()).start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int guess;
        while ((guess = scanner.nextInt()) != this.toGuess)
            sendIndiceMessage(guess);
        System.out.println("Number found !");
    }

    private void sendIndiceMessage(int input) {
        if (input < this.toGuess) {
            System.out.println("Number to found is more than '" + input + "'");
            return;
        }
        System.out.println("Number to found is less than '" + input + "'");
    }

    private static int random() {
        return ThreadLocalRandom.current().nextInt(1, 101);
    }

}
