package Chapter7;

import java.util.Random;

public class TerrainSimulator {

  private static final int MAX_HEIGHTS = 9;

  private static final int TERRAIN_LENGHT = 20;
  private static final int TERRAIN_WIDTH = 10;
	


  public static void main(String[] args) {
    double[][] heights = init();
  
  	Terrain lvl = new Terrain(heights);
  	lvl.printFloodMap(5);

  }

  private static double[][] init() {
		double[][] heights = new double[TERRAIN_WIDTH][TERRAIN_LENGHT];
		
		Random rgen = new Random();
		
	  for (int i = 0; i < heights.length; i++) {
	    for (int j = 0; j < heights[0].length; j++) {
	    	heights[i][j] = rgen.nextInt(MAX_HEIGHTS + 1);
	    }
	  }

    return heights;

  }

}
