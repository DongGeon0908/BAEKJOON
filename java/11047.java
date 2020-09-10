import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		int[] A = new int[N];
		for (int i = N - 1; i >= 0; i--) {
			A[i] = scan.nextInt();
		}

		int result = 0;
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			while (true) {
				if (K >= result+A[i]) {
					result = result + A[i];
					tmp++;
				} else {
					break;
				}
			}
		}
		System.out.print(tmp);

	}
}
