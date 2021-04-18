import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] data = new int[N + 1];
		data[0] = 0;

		for (int i = 1; i < N + 1; i++) {
			data[i] = data[i - 1] + scan.nextInt();
		}

		for (int i = 0; i < M; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			System.out.println(data[y] - data[x - 1]);
		}

	}
}
