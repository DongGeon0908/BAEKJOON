import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int max = 0;
		int ride = 0;
		for (int i = 0; i < 10; i++) {
			int off = scan.nextInt();
			int on = scan.nextInt();

			ride = ride - off + on;

			if (ride > max) {
				max = ride;
			}

		}

		System.out.println(max);

	}
}
