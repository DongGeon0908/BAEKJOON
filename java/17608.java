import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}

		int tmp = data[n - 1];
		int check = 1;
		for (int i = n - 2; i >= 0; i--) {
			if (tmp < data[i]) {
				check = check + 1;
				tmp = data[i];
			}
		}
		System.out.println(check);
	}
}
