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
		if ((data[0] + data[1]) > data[2]) {
			System.out.println(data[0] + data[1] + data[2]);
		} else {
			System.out.println((data[0] + data[1]) * 2 - 1);
		}

	}
}
