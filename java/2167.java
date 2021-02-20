import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] data = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = scan.nextInt();
			}
		}

		int k = scan.nextInt();

		for (int i = 0; i < k; i++) {
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			int c = scan.nextInt() - 1;
			int d = scan.nextInt() - 1;

			int result = 0;

			for (int t1 = a; t1 <= c; t1++) {
				for (int t2 = b; t2 <= d; t2++) {
					result = result + data[t1][t2];
				}
			}
			System.out.println(result);
		}

	}
}
