package Chapter9;

// import java.util.ArrayList;
import java.util.Scanner;

// package Chapter9;

/**
 * A question with a text and an answer.
 */
public class Question {
    private String text;
    private String answer;
    // private ArrayList<String> options;

    /**
     * Constructs a question with empty question and answer.
     * 
     */
    public Question() {
        text = "";
        answer = "";
        // options = new ArrayList<String>();
    }

    public void addText(String anOption) {
        
    }

    /**
     * Sets the question text.
     * 
     * @param questionText the text of this question
     */
    public void setText(String questionText) {
        text = questionText;
    }

    /**
     * Sets the answer for this question.
     * 
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    public String getAnswer() {
        return answer;
    }

    /**
     * Checks a given response for correctness.
     * 
     * @param response the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    /**
     * Displays this question.
     */
    public void display() {
        System.out.println(text);
    }

    public void test() {
        System.out.println("==> Question");
    }


    public void presentQuestion() {
        this.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(this.checkAnswer(response));
        in.close();
    }
}