import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] data = new int[n + 1][3];
		int[][] dp = new int[n + 1][3];

		for (int i = 1; i <= n; i++) {
			data[i][0] = scan.nextInt();
			data[i][1] = scan.nextInt();
			data[i][2] = scan.nextInt();
		}

		dp[1][0] = data[1][0];
		dp[1][1] = data[1][1];
		dp[1][2] = data[1][2];

		for (int i = 2; i <= n; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + data[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + data[i][1];
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + data[i][2];
		}

		System.out.println(Math.min(dp[n][2], Math.min(dp[n][0], dp[n][1])));
	}
}
