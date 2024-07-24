package chapter15;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SameHashCoder {

    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, HashSet<String>> record = new TreeMap<>();

        String filename = "words_alpha_mini.txt";
        Scanner in = new Scanner(new File(filename));

        String currentWord = "";
        int code = 0;
        
        while (in.hasNext()) {
            currentWord = in.next();
            code = currentWord.hashCode();
            
            HashSet<String> setWords = new HashSet<>();
            
            if (record.containsKey(code)) {
                setWords = record.get(code);
                setWords.add(currentWord);
                record.put(code, setWords);
            } else {
                setWords.add(currentWord);
                record.put(code, setWords);
            }
            
        }

        in.close();


        for (Integer key : record.keySet()) {
            if (key > 1)
                System.out.println(key +" : "+ record.get(key));
        }
    }



    
    
}
