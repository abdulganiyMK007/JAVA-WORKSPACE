package Chapter9;

import java.util.Scanner;

/**
 * This program shows a simple quiz with two question types.
 */
public class QuestionDemo3 {

    public static void main(String[] args) {


        AnyCorrectChoiceQuestion sixth = new AnyCorrectChoiceQuestion();
        sixth.setText("Which any of the following is a prime number?");
        sixth.addChoice("1", false);
        sixth.addChoice("2", true);
        sixth.addChoice("3", true);
        sixth.addChoice("4", false);
        sixth.addChoice("5", true);

        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        Question third = new FillInQuestion();
        third.setText("Who was the inventor of Java?");
        third.setAnswer("James Gosling");

        Question fourth = new NumericQuestion();
        fourth.setText("200 - 218");
        fourth.setAnswer("18");

        Question fifth = new NumericQuestion();
        fifth.setText("100 + 100");
        fifth.setAnswer("200");

        presentQuestion(sixth);
        presentQuestion(sixth);
        presentQuestion(sixth);
        presentQuestion(first);
        presentQuestion(second);
        presentQuestion(third);
        presentQuestion(fourth);
        presentQuestion(fifth);
    }

    /**
     * Presents a question to the user and checks the response.
     * 
     * @param q the question
     */
    public static void presentQuestion(Question q) {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);

        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
        in.close();
    }
}
