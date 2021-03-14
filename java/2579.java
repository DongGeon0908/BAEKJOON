import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] stairs = new int[301];
		int[] dp = new int[301];

		for (int i = 1; i <= n; i++) {
			stairs[i] = scan.nextInt();
		}

		dp[1] = stairs[1];
		dp[2] = dp[1] + stairs[2];
		dp[3] = (stairs[1] + stairs[3]) >= (stairs[2] + stairs[3]) ? (stairs[1] + stairs[3]) : (stairs[2] + stairs[3]);

		for (int i = 4; i <= n; i++) {
			dp[i] = (stairs[i] + stairs[i - 1] + dp[i - 3]) >= (stairs[i] + dp[i - 2])
					? (stairs[i] + stairs[i - 1] + dp[i - 3])
					: (stairs[i] + dp[i - 2]);
		}
		System.out.println(dp[n]);

	}
}
