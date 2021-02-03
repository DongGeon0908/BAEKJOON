import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result1 = 100;
		int result2 = 100;

		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			if (x > y) {
				result2 = result2 - x;
			} else if (x < y) {
				result1 = result1 - y;
			}
		}
		System.out.println(result1);
		System.out.println(result2);
	}
}
