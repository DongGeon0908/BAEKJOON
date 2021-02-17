import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] data = new int[n];
		int[] dp = new int[k + 1];
		dp[0] = 1;

		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = data[i]; j <= k; j++) {
				dp[j] = dp[j] + dp[j - data[i]];
			}
		}
		System.out.println(dp[k]);
	}
}
