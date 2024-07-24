package Chapter7;

public class Terrain {
	
	private double[][] heights;

	private static final String HASH = "*";
	private static final String SPACE = " ";

	public Terrain(double[][] heights) {
		this.heights = heights;
	}
	
	
	public void printFloodMap(double waterLevel) {
	  String map = "";
	  
	  for (int i = 0; i < heights.length; i++) {
		map += "|";
	    for (int j = 0; j < heights[0].length; j++) {
	    	map += (heights[i][j] <= waterLevel) ? HASH : SPACE; 
	    }
	    
	    map += "|\n";
	}
	  
	  System.out.println(map);
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
