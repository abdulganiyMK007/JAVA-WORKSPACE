package Chapter6;

public class Diamond {

	private static final String HASH = "*";
	private static final String SPACE = " ";

  public static void main(String[] args) {

		diamond(10);
		crossInDiamond(10);

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
