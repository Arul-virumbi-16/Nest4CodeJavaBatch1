
public class Assignment2 {

	public static void main(String[] args) {
		heightConverter(5,11);
		weightConverter(60);
		
	}

	static float heightConverter(int heightFeetPart , int heightInchPart) {
		double height;
		
		heightInchPart = heightInchPart + (heightFeetPart*12);
		height = heightInchPart * 2.54;
		
		System.out.println("Height in cm " + height);
		return (float)height;
	}
	static float weightConverter(int weight) {
		 double Finalweight = weight * 2.2;		
		 System.out.println("Weight in Pounds " + Finalweight);
		return (float)Finalweight;
	}

}
