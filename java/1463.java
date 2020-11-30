import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int[] result = new int[1000001];

		result[0] = 0;
		result[1] = 0;

		for (int i = 2; i < x + 1; i++) {
			result[i] = result[i - 1] + 1;

			if (i % 2 == 0 && result[i / 2] + 1 < result[i]) {
				result[i] = result[i / 2] + 1;
			}
			if (i % 3 == 0 && result[i / 3] + 1 < result[i]) {
				result[i] = result[i / 3] + 1;
			}

		}
		System.out.println(result[x]);
	}

}
