import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[n + 1];

		dp[1] = scan.nextInt();
		int answer = dp[1];
		if (n == 1) {
			System.out.println(answer);
		} else {
			for (int i = 2; i < n + 1; i++) {
				int tmp = scan.nextInt();
				dp[i] = Math.max(dp[i - 1] + tmp, tmp);
				answer = Math.max(answer, dp[i]);
			}
			System.out.println(answer);
		}
	}
}

/*
 * 해당 문제를 풀때 DP를 이용함
 * 
 * 점화식은
 * dp[i] = Math.max(dp[i-1] + tmp, tmp);
 * 
 * 이유는?
 * 직전에 구한값과 지금 입력받은 값의 크기를 더한 값을 지금 임력받은 값과 비교하면 연속된 합의 크기를 비교 가능
 * 
 */
