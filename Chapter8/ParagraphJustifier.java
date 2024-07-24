import java.util.ArrayList;

public class ParagraphJustifier {

    private static final String SPACE = " ";
    // private static final int LINE_LENGTH = 20;

    

    public static String justify(String paragraph, int lineLength) {
        ArrayList<String> jLineList = getJustifiedLines(paragraph, lineLength);
        String jParaString = "";
        int diffLength = 0;
        int spaceIndex = 0;
        int startIndex = 0;
        for (String jLine : jLineList) {
            diffLength = lineLength - jLine.length();
            if (!jLine.contains(SPACE))
                jLine = SPACE + jLine + SPACE;
            while (diffLength > 0) {
                spaceIndex = jLine.indexOf(SPACE, startIndex);
                if (spaceIndex == -1) {
                    startIndex = 0;
                    continue;
                }

                jLine = jLine.substring(0, spaceIndex + 1) + SPACE + jLine.substring(spaceIndex + 1);
                startIndex = spaceIndex;
                while (jLine.charAt(startIndex) == SPACE.charAt(0)) {
                    startIndex++;
                    if (startIndex >= jLine.length())
                        break;
                }
                diffLength--;
            }
            jParaString += jLine + "\n";
        }
        return jParaString.trim();
    }

    private static ArrayList<String> getJustifiedLines(String paragraph, int lineLength) {
        ArrayList<String> jLineList = new ArrayList<>();
        String jLine = "";
        int lengthSum = 0;
        String[] words = paragraph.split(SPACE);
        for (int i = 0; i < words.length; i++) {
            lengthSum += words[i].length() + 1;

            if (lengthSum > lineLength + 1) {
                jLineList.add(jLine.trim());
                jLine = "";
                lengthSum = 0;
                i--;
            } else {
                jLine += words[i] + SPACE;
            }
        }

        jLineList.add(jLine.trim());
        return jLineList;
    }

}
