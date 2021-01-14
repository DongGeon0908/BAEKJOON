import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		boolean[] data = new boolean[N + 1];
		Arrays.fill(data, false);

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				data[i] = true;
			}
		}

		int check = 0;
		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (data[i] == true) {
				check = check + 1;
			}
			if (check == K) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
