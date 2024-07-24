public class ParagraphJustifierDemo {
    
    public static void main(String[] args) {

        String paragraph = "Consider the task of fully justifying a paragraph of text to a target length, by putting as many words as possible on each line and evenly distributing extra spaces so that each line has the target length.  Devise a plan for writing a program that reads a paragraph of text and prints it fully justified. Describe a sequence of progressively more complex intermediate programs, similar to the approach in Section 8.5";
        // String paragraph = "I am good distributing to go, next time. Next time";
        String jString = ParagraphJustifier.justify(paragraph, 40);
        System.out.println(jString);
    }
}
