package chapter15;

import java.util.LinkedList;

public class LinkListDemo {

    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        print(strings);
        reverse(strings);
        print(strings);
        
    }

    public static void reverse(LinkedList<String> strings) {
        String iSwap = "";
        
        for (int i = 0; i < strings.size() / 2; i++) {
            iSwap = strings.get(i);
            strings.set(i, strings.get(strings.size() - i - 1));
            strings.set(strings.size() - i - 1, iSwap);
            
        }
    }

    public static void print(LinkedList<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
    
}
