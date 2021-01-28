import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();

		int result1 = 0;
		int result2 = 0;

		for (int i = 0; i < N.length() / 2; i++) {
			result1 = result1 + Integer.parseInt(N.substring(i, i + 1));
		}

		for (int i = N.length() / 2; i < N.length(); i++) {
			result2 = result2 + Integer.parseInt(N.substring(i, i + 1));
		}

		if (result1 == result2) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}

	}
}
