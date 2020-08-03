import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int tmp = 0;
		while (true) {
			for (int i = 0; i < count; i++) {
				System.out.print("* ");
			}
			tmp = tmp + 1;
			if (tmp == count) {
				break;
			}
			System.out.println();
			for (int i = 0; i < count; i++) {
				System.out.print(" *");
			}
			tmp = tmp + 1;
			if (tmp == count) {
				break;
			}
			System.out.println();
		}
	}
}
