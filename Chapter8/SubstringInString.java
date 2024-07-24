public class SubstringInString {

    public static void main(String[] args) {
        String word1 = "ABCDE";
        String word2 = "Test";
        boolean present = subInString(word1, word2);
        System.out.println(present);

    }

    private static boolean subInString(String word1, String word2) {
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 0; j < word1.length() - i + 1; j++) {
                if (word2.contains(word1.substring(j, j + i))) {
                    return true;
                }
            }
        }
    return false;
}

}
