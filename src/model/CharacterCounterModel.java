package model;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CharacterCounterModel {
    public static Map<String, Integer> countCharacter(String s) {
        Map<String, Integer> characterCounts = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            if (characterCounts.containsKey(word)) {
                int count = characterCounts.get(word);
                characterCounts.put(word, count + 1);
            } else {
                characterCounts.put(word, 1);
            }
        }
        return characterCounts;
    }
    
    public static void displayCharacterCounts(Map<String, Integer> characterCounts) {
        System.out.print("{");
        for (Map.Entry<String, Integer> entry : characterCounts.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }
        System.out.println("}");
    }
    
    public Map<Character, Integer> countLetters(String content) {
    Map<Character, Integer> letterCountMap = new HashMap<>();

    for (char c : content.toCharArray()) {
        if (Character.isLetter(c)) {
            char lowercaseC = Character.toLowerCase(c);
            letterCountMap.put(lowercaseC, letterCountMap.getOrDefault(lowercaseC, 0) + 1);
        }
    }

    return letterCountMap;
    }

    public int countCharacters(String content) {
        return content.length();
    }
}