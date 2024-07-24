package Chapter3;

public class Square {

	private int sideLength;  
	
	public Square(int initialLength)  {   
		sideLength = initialLength;    
	}  
	
	public int getArea() {
		return sideLength * sideLength; 
	}  
	
	public void grow() {
		sideLength = 2 * sideLength; 
	} 

}
