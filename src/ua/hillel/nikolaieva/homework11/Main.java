package ua.hillel.nikolaieva.homework11;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = scanner.nextLine();

        CharacterCounter characterCounter = new CharacterCounter(sentence);
        characterCounter.countCharacters();
        Map<Character, Integer> characterCount = characterCounter.getCharacterCount();

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
