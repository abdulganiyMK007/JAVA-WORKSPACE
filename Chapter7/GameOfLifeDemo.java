package Chapter7;

public class GameOfLifeDemo {

  public static void main(String[] args) {
  	glider();
		gliderGun();
  }
  
  private static void gliderGun() {
  	int bHeight = 57; // boardHeight
  	int gHeight = 38; // gliderHeight
  	
    GameOfLife gliderGun = new GameOfLife(bHeight, 44);
    gliderGun.occupy(bHeight - gHeight + 1, 3);
    gliderGun.occupy(bHeight - gHeight + 1, 4);
    gliderGun.occupy(bHeight - gHeight + 2, 3);
    gliderGun.occupy(bHeight - gHeight + 2, 4);
    gliderGun.occupy(bHeight - gHeight + 6, 5);
    gliderGun.occupy(bHeight - gHeight + 6, 6);
    
    gliderGun.occupy(bHeight - gHeight + 11, 1);
    gliderGun.occupy(bHeight - gHeight + 11, 2);
    gliderGun.occupy(bHeight - gHeight + 11, 6);
    gliderGun.occupy(bHeight - gHeight + 11, 7);
    gliderGun.occupy(bHeight - gHeight + 12, 2);
    gliderGun.occupy(bHeight - gHeight + 12, 3);
    gliderGun.occupy(bHeight - gHeight + 12, 4);
    gliderGun.occupy(bHeight - gHeight + 12, 5);
    gliderGun.occupy(bHeight - gHeight + 12, 6);
    gliderGun.occupy(bHeight - gHeight + 13, 2);
    gliderGun.occupy(bHeight - gHeight + 13, 3);
    gliderGun.occupy(bHeight - gHeight + 13, 5);
    gliderGun.occupy(bHeight - gHeight + 13, 6);
    gliderGun.occupy(bHeight - gHeight + 14, 2);
    gliderGun.occupy(bHeight - gHeight + 14, 3);
    gliderGun.occupy(bHeight - gHeight + 14, 5);
    gliderGun.occupy(bHeight - gHeight + 14, 6);
    gliderGun.occupy(bHeight - gHeight + 15, 3);
    gliderGun.occupy(bHeight - gHeight + 15, 4);
    gliderGun.occupy(bHeight - gHeight + 15, 5);
    gliderGun.occupy(bHeight - gHeight + 15, 3);
    gliderGun.occupy(bHeight - gHeight + 15, 4);
    gliderGun.occupy(bHeight - gHeight + 15, 5);
    
    gliderGun.occupy(bHeight - gHeight + 20, 5);
    gliderGun.occupy(bHeight - gHeight + 20, 6);
    gliderGun.occupy(bHeight - gHeight + 20, 7);
    gliderGun.occupy(bHeight - gHeight + 21, 5);
    gliderGun.occupy(bHeight - gHeight + 21, 6);
    gliderGun.occupy(bHeight - gHeight + 21, 7);
    gliderGun.occupy(bHeight - gHeight + 22, 4);
    gliderGun.occupy(bHeight - gHeight + 22, 8);
    gliderGun.occupy(bHeight - gHeight + 23, 3);
    gliderGun.occupy(bHeight - gHeight + 23, 9);
    gliderGun.occupy(bHeight - gHeight + 24, 4);
    gliderGun.occupy(bHeight - gHeight + 24, 8); 
    gliderGun.occupy(bHeight - gHeight + 25, 5);
    gliderGun.occupy(bHeight - gHeight + 25, 6);
    gliderGun.occupy(bHeight - gHeight + 25, 7);
    
    gliderGun.occupy(bHeight - gHeight + 35, 5);
    gliderGun.occupy(bHeight - gHeight + 35, 6);
    gliderGun.occupy(bHeight - gHeight + 36, 5);
    gliderGun.occupy(bHeight - gHeight + 36, 6);
    
    gliderGun.generate(30 * 5, 30);
  }
  
  private static void glider() {
    GameOfLife glider = new GameOfLife(12, 12);
		glider.occupy(1, 2);
		glider.occupy(2, 3);
		glider.occupy(3, 1);
		glider.occupy(3, 2);
		glider.occupy(3, 3);
		glider.generate(4 * 4, 4);
		
  }
  
  

}
