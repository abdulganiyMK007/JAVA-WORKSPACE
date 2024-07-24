package Chapter9;

import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion {

    private ArrayList<String> choices;

    /**
     * Constructs a choice question with no choices.
     */
    public AnyCorrectChoiceQuestion() {
        choices = new ArrayList<String>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            // Convert choices.size() to string
            String choicesString = getAnswer() + " " + choices.size();
            setAnswer(choicesString);
        }
    }

    //  public void test() {
    //     System.out.println("==> AnyCorrectChoiceQuestion");
    // }

    
    public boolean checkAnswer(String response) {
        return getAnswer().contains(response);
    }

    public void display() {
        // Display the question text
        super.display();

        // Display the answer choices
        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
    
}
