package Chapter4;

import javax.swing.JOptionPane;

public class MessageDialogTester {

    public static void main(String[] args) {
        String input1Str = JOptionPane.showInputDialog("Enter a number");
        double input1 = Double.parseDouble(input1Str);
        String input2Str = JOptionPane.showInputDialog("Enter another number");
        double input2 = Double.parseDouble(input2Str);

        JOptionPane.showMessageDialog(null, "SUM: "+ (input1 + input2));
        
    }





}