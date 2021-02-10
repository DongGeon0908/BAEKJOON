import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int resultA = 0;
		int resultB = 0;

		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				resultA = resultA + scan.nextInt() * 3;
			} else if (i == 2) {
				resultA = resultA + scan.nextInt() * 2;
			} else if (i == 3) {
				resultA = resultA + scan.nextInt();
			}
		}

		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				resultB = resultB + scan.nextInt() * 3;
			} else if (i == 2) {
				resultB = resultB + scan.nextInt() * 2;
			} else if (i == 3) {
				resultB = resultB + scan.nextInt();
			}
		}

		if (resultA > resultB) {
			System.out.println("A");
		} else if (resultB > resultA) {
			System.out.println("B");
		} else
			System.out.println("T");
	}
}
