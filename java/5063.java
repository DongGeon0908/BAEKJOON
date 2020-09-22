import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		int[] data = new int[T];

		for (int i = 0; i < T; i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			int n3 = scan.nextInt();

			data[i] = n1 - (n2 - n3);
		}

		for (int i = 0; i < T; i++) {
			if (data[i] < 0) {
				System.out.println("advertise");
			} else if (data[i] > 0) {
				System.out.println("do not advertise");
			} else {
				System.out.println("does not matter");
			}
		}

	}
}
