package chapter15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SingleStockGainCalculator {

    private static final String BUY_OPTION = "buy";
    private static final String SELL_OPTION = "sell";
    private static final String QUIT_OPTION = "quit";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Block> stockQueue = new LinkedList<>();
        boolean done = false;
        String input = "";
        String[] inputSplit = null;
        int quantity = 0;
        double price = 0;
        double gain = 0;
        int availableQuantity = 0;

        System.out.println("Enter: "+ BUY_OPTION +", "+ SELL_OPTION +" or "+ QUIT_OPTION);
        while (!done) {
            System.out.print(">>> Enter: ");
            input = in.nextLine();

            if (input.startsWith(BUY_OPTION)) {
                inputSplit = input.split(" ");
                quantity = Integer.parseInt(inputSplit[1]);
                price = Double.parseDouble(inputSplit[2]);
                stockQueue.add(new Block(quantity, price));
                availableQuantity += quantity;

            } else if (input.startsWith(SELL_OPTION)) {
                inputSplit = input.split(" ");
                quantity = Integer.parseInt(inputSplit[1]);
                price = Double.parseDouble(inputSplit[2]);
                gain = 0;
                
                if (availableQuantity > quantity || availableQuantity == quantity) {
                    availableQuantity -= quantity;
                    while (quantity > 0) {
                        int blockQuantity = stockQueue.peek().getQuantity();

                        if (quantity > blockQuantity || quantity == blockQuantity) {
                            Block shareBlock = stockQueue.remove();
                            gain += blockQuantity * (price - shareBlock.getPrice());
                            quantity -= blockQuantity;
                        } else {
                            Block shareBlock = stockQueue.peek();
                            blockQuantity = shareBlock.getQuantity() - quantity;
                            stockQueue.peek().setQuantity(blockQuantity);
                            gain += quantity * (price - shareBlock.getPrice());
                            quantity = 0;
                        }
                    }
                } else {
                    System.out.println("[INSUFFICIENT QUANTITY]");
                    System.out.println("[AVAILABLE QUANTITY: "+ availableQuantity +"]");
                }
                
                System.out.println("GAIN: "+ gain);

            } else if (input.startsWith(QUIT_OPTION)) {
                done = true;
                System.out.println("[END OF PROGRAM]");

            } else {
                System.out.println("[INVALID INPUT]");
            }
        }

        in.close();
        
    }
    
}
