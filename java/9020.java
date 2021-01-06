import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		boolean[] num = new boolean[10001];
		Arrays.fill(num, true);

		num[0] = false;
		num[1] = false;

		for (int i = 2; i <= 100; i++) { // 소수 구하기
			if (num[i] == true) {
				for (int j = i + i; j <= 10000; j = j + i)
					num[j] = false;
			}
		}

		for (int i = 0; i < N; i++) {
			int tmp = scan.nextInt();

			for (int j = 0; j < tmp; j++) {
				int num1 = (tmp / 2) - j;
				int num2 = (tmp / 2) + j;

				if (num[num1] == true && num[num2] == true) {
					System.out.println(num1 + " " + num2);
					break;
				}
			}
		}

	}
}
