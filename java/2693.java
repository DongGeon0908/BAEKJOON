import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int[] data = new int[10];

			for (int j = 0; j < 10; j++) {
				data[j] = scan.nextInt();
			}
			Arrays.sort(data);
			System.out.println(data[7]);
		}
	}
}
