import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int A1 = scan.nextInt();
		int A2 = scan.nextInt();
		int B1 = scan.nextInt();
		int B2 = scan.nextInt();

		if ((A1 + B2) >= (A2 + B1)) {
			System.out.println(A2 + B1);
		} else {
			System.out.println(A1 + B2);
		}
	}
}
