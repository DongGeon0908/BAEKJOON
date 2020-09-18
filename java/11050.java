import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		int n = 1;
		for (int i = N; i > N - K; i--) {
			n = n * i;
		}

		int k = 1;
		for (int i = 1; i <= K; i++) {
			k = k * i;
		}

		System.out.print(n / k);

	}
}
