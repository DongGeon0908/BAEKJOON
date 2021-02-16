import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[] dp = new int[11];
		dp[0] = 0; 
		dp[1] = 1; 
		dp[2] = 2; 
		dp[3] = 4; 
		for (int i = 4; i <= 10; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}

		for (int i = 0; i < T; i++) {
			int tmp = scan.nextInt();
			System.out.println(dp[tmp]);
		}
	}
}

/*
  		dp[0] = 0; // 0
		dp[1] = 1; // 0+1
		dp[2] = 2; // 1+1, 2
		dp[3] = 4; // 1+1+1, 1+2, 2+1
		dp[4] = 7; // 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1
		dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
*/
