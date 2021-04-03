import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] data = new int[n];
		
		// dp를 1로 초기화한 이유? =? 본인은 무조건 숫자를 세기때문에!
		int[] dp = new int[n];
		Arrays.fill(dp, 1);

		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}

		int max = dp[0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				
				// 기존 데이터와 비교해서 큰값인지 확인! ->  큰값이면 기존데이터 + 지금 본인 만큼의 수열길이가 만들어짐
				if (data[j] < data[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);

	}
}
