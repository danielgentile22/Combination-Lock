package me.daniel.combolock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CombinationLock combo = new CombinationLock("");
        combo.setCombination("cock");

        System.out.println("The combination is " + "\"" + combo.getTheCombination() + "\"");
        System.out.println();

        System.out.println("Enter guesses to find secret 4 letter combination.");
        System.out.println();

        System.out.println("If program returns a letter that means that you guessed the correcter letter and placement \n" +
                "while a '+' means correct letter but wrong placement \n" +
                "and an '*' means wrong letter and placement");
        System.out.println();

        System.out.println("Enter your guess: ");
        String guess = sc.next();

        while (!guess.equals(combo.getTheCombination())) {
            System.out.println("Wrong guess here is your clue: ");
            System.out.print(combo.getClue(guess));
            System.out.println();
            System.out.println("Enter your guess: ");
            guess = sc.next();
        }
        System.out.println("You guessed the right combination");
    }
}
