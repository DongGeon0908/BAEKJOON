import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] dp = new int[10001];
		int[] wine = new int[10001];

		for (int i = 1; i <= n; i++) {
			wine[i] = scan.nextInt();
		}

		if (n >= 1) {
			dp[1] = wine[1];
		}

		if (n >= 2) {
			dp[2] = dp[1] + wine[2];
		}

		if (n >= 3) {
			dp[3] = Math.max(dp[2], Math.max(dp[1] + wine[3], wine[2] + wine[3]));
		}

		for (int i = 4; i <= n; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
		}

		System.out.println(dp[n]);
	}
}
