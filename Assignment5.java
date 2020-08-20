import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k=n-1;
		for(int i=1 ; i < 2*n ; i++ ) {
			
			if(i<=n) {
				for(int j=1 ; j <= i ; j++) {
					System.out.print("*");
				}
			}
			if(i > n) {

				for(int j = k ; j > 0 ; j--) {
					System.out.print("*");
					
				}k--;
			}
			System.out.println();
			
		}
	}

}
