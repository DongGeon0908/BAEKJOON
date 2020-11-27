import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		String result = "";

		for (int i = 0; i < N; i++) {
			result = result + Integer.toString(N);
		}

		if (result.length() > M) {
			System.out.print(result.substring(0, M));
		} else {
			System.out.print(result);
		}

	}
}
