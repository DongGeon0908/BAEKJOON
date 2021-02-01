import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] data = new int[2 * n];

		int result = 0;

		for (int i = 0; i < 2 * n; i++) {
			data[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			result = result + data[2 * i + 1] % data[2 * i];
		}
		System.out.println(result);
	}
}
