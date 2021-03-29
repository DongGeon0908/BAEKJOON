import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Integer[] data = new Integer[N];

		for (int i = 0; i < N; i++) {
			data[i] = scan.nextInt();
		}

		Arrays.sort(data, Collections.reverseOrder());

		int result = 0;

		if (N == 1) {
			result = data[0];
		} else if (N == 2) {
			result = data[0] + data[1];
		} else {
			int cnp = N % 3;
			int tmp = N / 3;
			int k = 0;
			while (tmp-- > 0) {
				result = result + data[k] + data[k + 1] + data[k + 2]
						- Math.min(Math.min(data[k], data[k + 1]), data[k + 2]);
				k = k + 3;
			}
			if (cnp == 1) {
				result = result + data[data.length - 1];
			} else if (cnp == 2) {
				result = result + data[data.length - 1] + data[data.length - 2];
			}
		}

		System.out.println(result);
	}
}
