import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] data = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i] = scan.nextInt();
		}

		Arrays.sort(data);

		for (int i : data) {
			System.out.print(i + " ");
		}

	}
}
