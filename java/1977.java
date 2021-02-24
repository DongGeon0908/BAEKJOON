import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0;
		int min = 0;
		for (int i = m; i <= n; i++) {
			for (int j = 1; j <= 100; j++) {
				if (i == j * j && min == 0) {
					sum = sum + i;
					min = min + i;
				} else if (i == j * j) {
					sum = sum + i;
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
