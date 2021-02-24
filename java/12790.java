import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int a1 = scan.nextInt();
			int b1 = scan.nextInt();
			int c1 = scan.nextInt();
			int d1 = scan.nextInt();

			a = a + a1;
			if (a < 1) {
				a = 1;
			}
			b = b + b1;
			if (b < 1) {
				b = 1;
			}
			c = c + c1;
			if (c < 0) {
				c = 0;
			}
			d = d + d1;

			System.out.println(a + 5 * b + 2 * c + 2 * d);
		}
	}
}
