import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[1001];

		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 3;

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + 2 * dp[i - 2];
			dp[i] = dp[i] % 10007;
		}

		System.out.println(dp[n]);

	}
}

/* 점화식이 너무 어렵다 
 * */
 
