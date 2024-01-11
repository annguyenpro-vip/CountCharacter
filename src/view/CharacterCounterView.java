package view;

import java.util.Map;

public class CharacterCounterView {
    public void displayLetterCount(Map<Character, Integer> letterCountMap) {
    System.out.print("{ ");

    for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
        char c = entry.getKey();
        int count = entry.getValue();
        System.out.print(c + ": " + count + ", ");
    }

    System.out.println("}");
    }

    public void displayCharacterCount(int count) {
        System.out.println("Character count: " + count);
    }
}