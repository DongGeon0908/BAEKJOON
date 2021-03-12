import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[][] data = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				data[i][j] = scan.nextInt();
			}
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j - 1 >= 0) {
					if (data[i - 1][j] >= data[i - 1][j - 1]) {
						data[i][j] = data[i][j] + data[i - 1][j];
					} else {
						data[i][j] = data[i][j] + data[i - 1][j - 1];
					}
				} else {
					data[i][j] = data[i][j] + data[i - 1][j];
				}
			}
		}

		int max = data[0][0];
		for (int i = 0; i < n; i++) {
			if (max <= data[n - 1][i]) {
				max = data[n - 1][i];
			}
		}

		System.out.println(max);

	}
}
