import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		a = Math.abs(a);
		b = Math.abs(b);

		if (a + b <= c) {
			if ((a + b) % 2 == 0 && c % 2 == 0) {
				System.out.println("YES");
			} else if ((a + b) % 2 != 0 && c % 2 != 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}

	}

}
