import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[5];

		int tmp = 0;
		for (int i = 0; i < 5; i++) {
			data[i] = scan.nextInt();
			tmp = tmp + data[i];
		}

		Arrays.sort(data);

		System.out.println(tmp / 5);
		System.out.println(data[2]);

	}
}
