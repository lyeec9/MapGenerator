import Java.util.Math;

class UnitVector{
	double randomValue;
	double xVector;
	double yVector;

	public UnitVector(double randomValue){
		this.randomValue = randomValue;
		setVector();
	}

	public setVector(double randomValue){
		xVector = Math.cos(randomValue * Math.PI * 2);
		yVector = Math.sin(randomValue * Math.PI * 2);
	}
	public double[] getVector(){
		return double[] {xVector, yVector};
	}
}