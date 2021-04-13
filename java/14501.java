import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] T = new int[N + 1];
		int[] P = new int[N + 1];
		int[] dp = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {
			T[i] = scan.nextInt();
			P[i] = scan.nextInt();

			dp[i] = P[i];
		}

		for (int i = 2; i < N + 1; i++) {
			for (int j = 1; j < i; j++) {
				if (i - j >= T[j]) {
					dp[i] = Math.max(P[i] + dp[j], dp[i]);
				}
			}
		}

		int result = 0;

		for (int i = 1; i < N + 1; i++) {
			if (i + T[i] <= N + 1) {
				result = Math.max(result, dp[i]);
			}
		}
		System.out.println(result);

	}
}
