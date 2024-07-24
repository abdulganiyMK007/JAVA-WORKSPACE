package Chapter9;

public class FillInQuestion extends Question {

    public FillInQuestion() {
    }

    public void setText(String questionText) {
        super.setText(questionText + " _______");
    }

}
