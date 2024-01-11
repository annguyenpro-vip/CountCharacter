package controller;

import java.util.Map;
import java.util.Scanner;
import model.CharacterCounterModel;
import view.CharacterCounterView;
import view.Menu;

public class CharacterCounterController {
    private CharacterCounterModel model;
    private CharacterCounterView view;

    public CharacterCounterController(CharacterCounterModel model, CharacterCounterView view) {
        this.model = model;
        this.view = view;
    }

    public void processInput() {
        int choice;

        do {
            choice = Menu.displayMenu();

            switch (choice) {
                case 1:
                    String content = Menu.getInput();
                    Map<Character, Integer> letterCountMap = model.countLetters(content);
                    view.displayLetterCount(letterCountMap);
                    break;
                case 2:
                    content = Menu.getInput();
                    int characterCount = model.countCharacters(content);
                    view.displayCharacterCount(characterCount);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }
    
    public void CharacterCounterModel(){
        System.out.println("Enter your content:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<String, Integer> characterCounts = CharacterCounterModel.countCharacter(s);
        CharacterCounterModel.displayCharacterCounts(characterCounts);
        Map<Character, Integer> letterCounts = CharacterCounterModel.countLetters(s);
        CharacterCounterModel.displayLetterCounts(letterCounts);
        System.out.println("--------------------------------");
    }
}