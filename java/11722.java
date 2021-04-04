import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] data = new int[n];

		int[] dp = new int[n];
		Arrays.fill(dp, 1);

		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}

		int min = dp[0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {

				// 기존 데이터와 비교해서 작은 값인지 확인하기
				if (data[j] > data[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}

			min = Math.max(min, dp[i]);
		}
		System.out.println(min);

	}
}
