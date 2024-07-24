package chapter14;

public class BinarySearchDemo {

    public static void main(String[] args) {
        // int[] array = new int[];
        int[] array = {0, 0, 2, 3, 4, 5, 5, 6, 7, 7, 7, 9, 9};

        int index = BinarySearcher.search(array, 0, array.length - 1, 8);
        System.out.println("INDEX: "+ index);

    }
    
}
