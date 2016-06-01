/**
 *	
 **/
class MapGenerator{
	

	/**
	 * 	Calls noise generation algorithm to create an elevation map
	 **/
	public double[][] elevationGenerator(int length, int height){
		double[][] elevation[length][height];
		for (int x = 0; x < length; x++) {
		  for (int y = 0; y < height; y++) {      
		    double nx = x/length - 0.5, ny = y/height - 0.5;
		    elevation[x][y] = noise(nx, ny);
		  }
		}
	}

	/**
	 * 	Calls noise generation algorithm to create an elevation map
	 **/
	public double[][] elevationGenerator(int length, int height, double frequency){
		double[][] elevation[length][height];
		for (int x = 0; x < length; x++) {
		  for (int y = 0; y < height; y++) {      
		    double nx = x/length - 0.5, ny = y/height - 0.5;
		    elevation[x][y] = noise(frequency * nx, frequency * ny);
		  }
		}
	}

	public double noise()
	NoiseGenerator noiseGenerator = new Generator();
	
}