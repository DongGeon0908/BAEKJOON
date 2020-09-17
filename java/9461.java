import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] testcase = new int[N];
		for (int i = 0; i < N; i++) {
			testcase[i] = scan.nextInt();
		}

		long[] data = new long[100];
		data[0] = 1;
		data[1] = 1;
		data[2] = 1;
		data[3] = 2;
		data[4] = 2;
		data[5] = 3;

		for (int i = 6; i < 100; i++) {
			data[i] = data[i - 5] + data[i - 1];
		}

		for (int i = 0; i < N; i++) {
			System.out.println(data[testcase[i] - 1]);
		}

	}
}
