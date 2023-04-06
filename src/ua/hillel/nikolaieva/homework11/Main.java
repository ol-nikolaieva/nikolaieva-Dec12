package ua.hillel.nikolaieva.homework11;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = scanner.nextLine();

        CharacterCounter characterCounter = new CharacterCounter(sentence);
        characterCounter.countCharacters();
        characterCounter.printCharacterCount();
    }

}