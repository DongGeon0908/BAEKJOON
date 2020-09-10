import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		Arrays.sort(A);

		Integer[] B = new Integer[N];
		for (int i = 0; i < N; i++) {
			B[i] = scan.nextInt();
		}
		Arrays.sort(B, Collections.reverseOrder());

		int result = 0;
		for (int i = 0; i < N; i++) {
			result = result + A[i] * B[i];
		}

		System.out.print(result);
	}
}
