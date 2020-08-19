import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		int lena = a.length();
		int lenb = b.length();
		String lasta = a.substring(lena-2,lena); 
		String lastb = b.substring(lenb-2,lenb); 
		String firsta = a.substring(0,2); 
		String firstb = b.substring(0,2); 

		String finala = lastb + a.substring(2, lena-2) + firstb;
		String finalb = lasta + b.substring(2, lenb-2) + firsta;

		System.out.println(finala); 
		System.out.println(finalb);

	}

}
