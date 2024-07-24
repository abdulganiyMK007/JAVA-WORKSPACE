package chapter15;

import java.util.Objects;

public class Block {

    private int quantity;
    private double price;

    public Block(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Block[quantity: " + quantity + ", price: " + price + "]";
    }

    public boolean equals(Block otherBlock) {
        return (otherBlock.getQuantity() == quantity) && (otherBlock.getPrice() == price);
    }

    public int hashCode() {
        return Objects.hash(quantity, price);
    }

}
