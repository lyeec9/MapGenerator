class CoordinatePair{
	int x = INTEGER.MAX_VALUE;
	int y = INTEGER.MAX_VALUE;
	UnitVector v;

	public CoordinatePair(int xCoord, int yCoord, UnitVector vector){
		x = xCoord;
		y = yCoord;
		v = vector;
	}

	public CoordinatePair(int xCoord, int yCoord){
		x = xCoord;
		y = yCoord;
	}

	public boolean setUnitVector(double randomValue){
		if(x == INTEGER.MAX_VALUE || y == INTEGER.MAX_VALUE){
			return false;
		}
		v = new UnitVector(randomValue);
		
	}

}