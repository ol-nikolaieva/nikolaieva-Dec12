package ua.hillel.nikolaieva.homework11;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    private String sentence;
    private Map<Character, Integer> characterCount;

    public CharacterCounter(String sentence) {
        this.sentence = sentence;
        this.characterCount = new HashMap<>();
    }

    public void countCharacters() {
        for (char character : sentence.toCharArray()) {
            if (Character.isLetter(character)) {
                char lowercaseC = Character.toLowerCase(character);
                characterCount.put(lowercaseC, characterCount.getOrDefault(lowercaseC, 0) + 1);
            }
        }
    }

    public void printCharacterCount() {
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
