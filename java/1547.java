import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 1;

		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			if (result == x) {
				result = y;
			} else if (result == y) {
				result = x;
			}
		}
		System.out.println(result);
	}
}
