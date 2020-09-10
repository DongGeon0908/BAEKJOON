import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();

		for (int i = 0; i < data; i++) {
			for (int k = 1; k < data - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = data; i > 0; i--) {
			for (int k = 0; k <= data - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
