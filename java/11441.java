import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N + 1];
		A[0] = 0;

		for (int i = 1; i <= N; i++) {
			A[i] = A[i - 1] + scan.nextInt();
		}

		int M = scan.nextInt();
		while (M-- > 0) {
			int i = scan.nextInt();
			int j = scan.nextInt();

			System.out.println(A[j] - A[i - 1]);
		}
	}
}
