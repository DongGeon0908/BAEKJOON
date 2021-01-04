import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int[] data = new int[2 * N];

		for (int i = 0; i < N; i++) {
			data[2 * i] = scan.nextInt();
			data[2 * i + 1] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int tmp = 0;
			int distance = 0;

			while (true) {
				distance = distance + 1;

				data[2 * i] = data[2 * i] + distance;
				tmp = tmp + 1;

				if (data[2 * i] >= data[2 * i + 1]) {
					break;
				}

				data[2 * i + 1] = data[2 * i + 1] - distance;
				tmp = tmp + 1;

				if (data[2 * i + 1] <= data[2 * i]) {
					break;
				}

			}
			System.out.println(tmp);
		}

	}
}
