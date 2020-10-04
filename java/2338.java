import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		String B = scan.nextLine();

		BigInteger a = new BigInteger(A);
		BigInteger b = new BigInteger(B);
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		
	}
}
