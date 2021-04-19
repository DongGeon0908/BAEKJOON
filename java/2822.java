import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] data = new int[8];
		int result = 0;
		for (int i = 0; i < 8; i++) {
			data[i] = scan.nextInt();
			result = result + data[i];
		}

		int[] tmp = Arrays.copyOf(data, 8);
		Arrays.sort(tmp);

		result = result - tmp[0] - tmp[1] - tmp[2];

		System.out.println(result);

		for (int i = 0; i < 8; i++) {
			for (int j = 7; j >= 3; j--) {
				if (tmp[j] == data[i]) {
					System.out.println(i + 1);
				}
			}
		}

	}
}
