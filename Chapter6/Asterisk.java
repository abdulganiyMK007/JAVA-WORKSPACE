package Chapter6;

public class Asterisk {

	private static final String HASH = "*";
	private static final String SPACE = " ";

  public static void main(String[] args) {
  
  	crossInBox(20);
  	xInBox(20);
  	filledAndHollowBox(20);
  	
  	diamond(10);
  	crossInDiamond(10);
  	
  }
   
  
  private static String crossInBox(int size) {
  	String draw = "";
  
  	for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
      	if ((i == 0) || (j == 0) || (i == size - 1) || (j == size - 1) || (i == size / 2) || (j == size / 2)) {
      		draw += HASH;
      	} else {
      		draw += SPACE;
      	}
      
      }
      draw += "\n";
    }
    System.out.println(draw);
    return draw;
  }
  
  private static String xInBox(int size) {
  	String draw = "";
  
  	for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
      	if ((i == 0) || (j == 0) || (i == size - 1) || (j == size - 1) || (i == j) || (i + j == size - 1)) {
      		draw += HASH;
      	} else {
      		draw += SPACE;
      	}
      
      }
      draw += "\n";
    }
  
  	System.out.println(draw);
  	return draw;
 }
  
  
  
  private static String filledAndHollowBox(int size) {
    
    String hollow = "";
    String fill = "";
    String box = "";
    
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
      
      	fill += HASH;
      	
      	if ((i == 0) || (j == 0) || (i == size - 1) || (j == size - 1)) {
      	  hollow += HASH;
      	} else {
      		hollow += SPACE;  
        }
        
      }
      
      box += fill + SPACE + SPACE + hollow + "\n";
      fill = hollow = "";
    }
    
    
    System.out.println(box);
    return fill;
    
  } 
  
  
  private static String crossInDiamond(int size) {
		size = 2 * size - 1;
  	String draw = "";
  	
  	for (int i = 0; i < size; i++) {
  	
  		if (i <= size / 2) {
  			for (int j = 0; j < size; j++) {
  				if (j <= (size / 2 + i) && j >= (size / 2 - i) && (j != size / 2 && i != size / 2)) {
  					draw += HASH;
  				} else {
  				  draw += SPACE;
  				}
  			}
  		} else {
  			for (int j = 0; j < size; j++) {
  				if (j >= (size / 2 + i - size + 1) && j <= (size / 2 - i + size - 1) && (j != size / 2 && i != size / 2)) {
  				  draw += HASH;
  				} else {
  					draw += SPACE;  
  				}
  			}
  		}
  		draw += "\n";
  	}
  
  	System.out.println(draw);
  	return draw;
  }
  
  
  
  private static String diamond(int size) {
		size = 2 * size - 1;
  	String draw = "";
  	
  	for (int i = 0; i < size; i++) {
  	
  		if (i <= size / 2) {
  			for (int j = 0; j < size; j++) {
  				if (j <= (size / 2 + i) && j >= (size / 2 - i)) {
  					draw += HASH;
  				} else {
  				  draw += SPACE;
  				}
  			}
  		} else {
  			for (int j = 0; j < size; j++) {
  				if (j >= (size / 2 + i - size + 1) && j <= (size / 2 - i + size - 1)) {
  				  draw += HASH;
  				} else {
  					draw += SPACE;  
  				}
  			}
  		}
  		draw += "\n";
  	}
  
  	System.out.println(draw);
  	return draw;
  }
  
  

}
