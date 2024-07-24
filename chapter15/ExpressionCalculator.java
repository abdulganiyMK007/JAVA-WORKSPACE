package chapter15;

import java.util.Scanner;
import java.util.Stack;
import java.lang.Math;

public class ExpressionCalculator {

    private static final String OPEN_BRACKET = "(";
    private static final String CLOSE_BRACKET = ")";

    private static Stack<Integer> numStack;
    private static Stack<String> opStack;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        numStack = new Stack<>();
        opStack = new Stack<>();

        System.out.println("Enter one number or operator per line, Q to quit. ");
        boolean done = false;
        
        while (!done) {
            System.out.print(">>> ");
            String input = in.nextLine();

            // If the command is an operator, pop the arguments and push the result
            if (isNumber(input)) {
                numStack.push(Integer.parseInt(input));

            } else if (input.equals(OPEN_BRACKET)) {
                opStack.push(input);

            } else if (isOperator(input)) {
                while (!opStack.isEmpty() && isLowerPrecedence(input)) {
                    evaluateTheTop();
                    if (numStack.size() == 1) break;
                }
                opStack.push(input);

            } else if (input.equals(CLOSE_BRACKET)) {
                while (!opStack.peek().equals(OPEN_BRACKET)) {
                    evaluateTheTop();
                }
                opStack.pop();

            } else if (input.equals("Q") || input.equals("q")) {
                done = true;
                while (!opStack.isEmpty()) {
                    evaluateTheTop();

                }
            } else {
                // Not an operator--push the input value
                System.out.println("[INVALID INPUT]");
            }

            System.out.println("NUM_STACK: "+ numStack);
            System.out.println("OP_STACK: "+ opStack);
        }
        
        System.out.println(numStack);
        in.close();
    }

    private static void evaluateTheTop() {
        int operandTwo = numStack.pop();
        // System.out.println("Pop 1 ==> "+ operandTwo +", NUM_STACK: "+ numStack);

        int operandOne = numStack.pop();
        // System.out.println("Pop 2 ==> "+ operandOne +", NUM_STACK: "+ numStack);

        String operator = opStack.pop();
        // System.out.println("Pop 1 ==> "+ operator +", OP_STACK: "+ opStack);

        numStack.push(compute(operandOne, operandTwo, operator));
    }

    private static int compute(int operandOne, int operandTwo, String operator) {
        // If the command is an operator, pop the arguments and push the result
        if (operator.equals("+")) {
            return operandOne + operandTwo;

        } else if (operator.equals("-")) {
            return operandOne - operandTwo;

        } else if (operator.equals("*") || operator.equals("x")) {
            return operandOne * operandTwo;

        } else if (operator.equals("/")) {
            return operandOne / operandTwo;

        } else if (operator.equals("%")) {
            return operandOne % operandTwo;

        } else {
            
            return (int) Math.pow((double) operandOne, (double) operandTwo);
        }
    }

    private static boolean isLowerPrecedence(String input) {
        if (!isOperator(opStack.peek())) return false;

        int inputPrecedenceLevel = getPrecedenceLevel(input);
        int onStackOpPrecedenceLevel = getPrecedenceLevel(opStack.peek());
        
        return inputPrecedenceLevel < onStackOpPrecedenceLevel;
    }

    private static int getPrecedenceLevel(String anOperator) {
        int level = 0;
        if (anOperator.equals("+") || anOperator.equals("-")) {
            level = 1;
        } else if (anOperator.equals("^")) {
            level = 3;
        } else {
            level = 2;
        }

        return level;
    }

    private static boolean isNumber(String input) {
        return input.matches("^[0-9]+$");
    }

    private static boolean isOperator(String input) {
        return input.matches("[-*+/x%^]");
    }
    
}
