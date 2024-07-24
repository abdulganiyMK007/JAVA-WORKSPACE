package chapter15;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class MultipleStockGainCalculator {

    private static final String BUY_OPTION = "buy";
    private static final String SELL_OPTION = "sell";
    private static final String QUIT_OPTION = "quit";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Map<String, Queue<Block>> stockStorage = new HashMap<>();
        Map<String, Integer> currentQuantityCount = new HashMap<>();
        boolean done = false;
        String input = "";
        String[] inputSplit = null;
        String symbol = "";
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
                symbol = inputSplit[1];
                quantity = Integer.parseInt(inputSplit[2]);
                price = Double.parseDouble(inputSplit[3]);

                if (stockStorage.containsKey(symbol)) {
                    stockStorage.get(symbol).add(new Block(quantity, price));
                    currentQuantityCount.put(symbol, currentQuantityCount.get(symbol) + quantity);
                } else {
                    Queue<Block> stock = new LinkedList<>();
                    stock.add(new Block(quantity, price));
                    stockStorage.put(symbol, stock);
                    currentQuantityCount.put(symbol, quantity);
                }

            } else if (input.startsWith(SELL_OPTION)) {
                inputSplit = input.split(" ");
                symbol = inputSplit[1];
                quantity = Integer.parseInt(inputSplit[2]);
                price = Double.parseDouble(inputSplit[3]);
                gain = 0;
                
                if (!stockStorage.containsKey(symbol)) {
                    System.out.println("[COMPANY SYMBOL \""+ symbol +"\" NOT AVAILABLE]");
                    continue;
                }

                availableQuantity = currentQuantityCount.get(symbol);
                Queue<Block> stockQueue = stockStorage.get(symbol);

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

                    currentQuantityCount.put(symbol, availableQuantity);
                    System.out.println("GAIN: "+ gain);
                } else {
                    System.out.println("[INSUFFICIENT QUANTITY]");
                    System.out.println("[AVAILABLE QUANTITY FOR COMPANY "+ symbol +": "+ availableQuantity +"]");
                }

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
