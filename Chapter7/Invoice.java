package Chapter7;
import java.util.ArrayList;

public class Invoice {
	
	private static final double DISOUNT_RATE = 0.2;
	private static final int MIN_PET = 1;
	private static final int MIN_ITEM = 5;

	private ArrayList<Item> collection;
	private int petCount;
	
	public Invoice() {
	  collection = new ArrayList<Item>(); 
	}
	
	
	public void add(Item anItem) {
	  collection.add(anItem);
	  if (anItem.isPet()) petCount++;
	}
	
	public double getDiscount() {
	  boolean isDiscount = (petCount >= MIN_PET) && (collection.size() - petCount >= MIN_ITEM);
	  
	  if (isDiscount) {
	    double totalItemPrice = 0;
	    
	    for (int i = 0; i < collection.size(); i++) {
	    	Item anItem = collection.get(i);
	    	 
	    	if (!anItem.isPet()) {
	    		totalItemPrice += anItem.getPrice() * anItem.getQuantity();
	    	}
			}
	    
	    return totalItemPrice * DISOUNT_RATE;
		} else {
			return 0;  
		}
	}

}
