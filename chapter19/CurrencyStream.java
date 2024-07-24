package chapter19;

import java.util.Currency;

public class CurrencyStream {

    public static void main(String[] args) {
        Currency.getAvailableCurrencies().stream()
            .map(w -> w + "")
            .sorted()
            .forEach(w -> System.out.println(w));
    }

    
    
}
