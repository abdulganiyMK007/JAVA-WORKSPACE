package Chapter9;

public class NumericQuestion extends Question {

    private final double ERROR = 0.01;

    private static final char CHAR_ZERO = '0';
    private static final char CHAR_NINE = '9';
    private static final char DOT_CHAR = '.';

    public NumericQuestion() {}

    public boolean checkAnswer(String response) {
        if (!isNumeric(response)) return false;

        double responseDouble = Double.parseDouble(response);
        double answerDouble = Double.parseDouble(getAnswer());
        double diff = Math.abs((responseDouble * 100 - answerDouble * 100) / 100);

        return (diff > ERROR) ? false : true;
    }


    private static boolean isNumeric(String text) {
        char ch = ' ';
        int pointMark = 0;
        for (int i = 0; i < text.length(); i++) {

            ch = text.charAt(i);
            if (ch < CHAR_ZERO || ch > CHAR_NINE) {
                if (pointMark == 0) {
                    if (ch == DOT_CHAR) {
                        pointMark++;
                        continue;
                    }
                }
                return false;
            }
        }

        return true;
    }


   

}
