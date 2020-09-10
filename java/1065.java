import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int result = 0;
		if (N < 100) {
			result = N;
			System.out.print(result);
		} else {
			for (int i = 100; i <= N; i++) {
				int a = i / 100;
				int b = (i % 100) / 10;
				int c = (i % 100) % 10;

				if ((b - a) == (c - b)) {
					result = result + 1;
				}

			}

			System.out.print(result + 99);
		}
	}
}
