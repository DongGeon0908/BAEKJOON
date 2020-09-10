import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = count-1; i >= 1; i--) {
			for (int j = 0; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
