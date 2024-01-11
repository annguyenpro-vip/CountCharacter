import controller.CharacterCounterController;
import model.CharacterCounterModel;
import view.CharacterCounterView;

public class CharacterCounter {
    public static void main(String[] args) {
        CharacterCounterModel model = new CharacterCounterModel();
        CharacterCounterView view = new CharacterCounterView();
        CharacterCounterController controller = new CharacterCounterController(model, view);

        controller.processInput();
    }
}