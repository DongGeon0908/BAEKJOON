import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] data = new int[N];
		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scan.nextInt();
		}
		Arrays.sort(data);

		for (int i = 0; i < N; i++) {
			result[i] = data[i] * (N - i);
		}
		Arrays.sort(result);
		System.out.print(result[N-1]);

	}
}
