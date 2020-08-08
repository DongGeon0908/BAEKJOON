import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		int[] data = new int[T * 2];
		for (int i = 0; i < T * 2; i++) {
			data[i] = scan.nextInt();
		}
		for (int i = 0; i < T; i++) {
			int U = data[2 * i + 1] * 2 - data[2 * i];
			System.out.println(U + " " + (data[2 * i + 1] - U));
		}

	}
}
