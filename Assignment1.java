
public class Assignment1 {

	public static void main(String[] args) {
		double product1 = 10.5;
		double product2 = 25.2;
		double product3 = 30;

		double tax = 5;
		double total = product1 + product2 + product3;
		double finalamt = (tax/100.0)*total;
		System.out.println("Final Amount " + finalamt + total);
		
	}

}
