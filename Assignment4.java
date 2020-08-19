import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int n = 0;
		int odd = 0;
		int even = 0;
		System.out.println();
		
		if(a.startsWith("-"))  n = 1;
		
		for(int i = n; i < a.length();i++) {	
			if(a.charAt(i)%2 == 0)
				even++;
			if(a.charAt(i)%2 == 1)
				odd++;
		}
		
		System.out.println("Odd Digit : " + odd);
		System.out.println("Even Digit : " + even);

	}

}
