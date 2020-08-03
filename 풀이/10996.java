import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int tmp = 0;
		if (count % 2 != 0) {
			while (true) {
				if (count == (2 * tmp - 1)) {
					break;
				} else {
					tmp = tmp + 1;
				}
			}
		}

		for (int i = 1; i <= count; i++) {
			if (count % 2 == 0) {
				for (int j = 1; j <= count / 2; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 1; j <= tmp; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
			for (int j = 1; j <= count / 2; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
