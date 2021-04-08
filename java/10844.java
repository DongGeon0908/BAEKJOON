import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[][] dp = new int[101][12]; // 0은 제외이다. 12까지 한 이유는 for문에 dp를 구할 떄 범위를 넘어가니까
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < 11; j++) { // 10까지 연산하는 이유는 해당 값이 9일때 10의 값이 필요하기 때문
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
			}

			// 왜 해당 for문에서 1000000000 나머지 연산을 진행한지 완벽하게 이해하지 못했다.
			// 범위값이 넘어가기 때문이라고 하는데 나에게 아직 어렵다....
			// 해당 부분에 대한 설명이 필요하다..
		}

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = (sum + dp[n][i]) % 1000000000;
		}

		System.out.println(sum);

	}

}
