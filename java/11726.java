import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[1001];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
			dp[i] = dp[i] % 10007;
		}

		System.out.println(dp[n]);

	}
}

/*
 * 문제를 풀때 계속 틀렸다.
 * 그 이유는 마지막 출력에만 나머지 연산을 적용했기 때문이다.
 * 위 같은 나머지 연산이 들어가는 문제에서는
 * dp의 값을 구할때마다 수행해야 한다.
 * 아니면 overflow 발생...
 */
