import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] data = new int[n][2];

		for (int i = 0; i < n; i++) {
			data[i][0] = scan.nextInt();
			data[i][1] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int result = 1;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				} else {
					if (data[i][0] < data[j][0] && data[i][1] < data[j][1]) {
						result = result + 1;
					}
				}
			}
			System.out.print(result + " ");
		}

	}
}
