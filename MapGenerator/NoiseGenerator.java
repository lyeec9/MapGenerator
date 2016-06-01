/**
 *	Uses a Perlin Noise Generator to create random noise.
 **/
class NoiseGenerator extends Generator{
	private Random randomGenerator;
	

	public NoiseGenerator(){
		randomGenerator = new Random();
	}

	public NoiseGenerator(long seed){
		randomGenerator = new Random();
		randomGenerator.setSeed(seed);	
	}

	/**
	 *	Takes in an X,Y coordinate where the point resides
	 **/
	public double perlin(double x, double y){

	}

	/**
	 *	Takes in a seed and returns a pseudorandom number
	 **/
	private CoordinatePair getPseudorandomNumber(){
		return randomGenerator.nextDouble();
	}


}