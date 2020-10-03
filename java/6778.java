import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		for (int i = 0; i < 3; i++) {
			if (a >= 3 && b <= 4 && i == 0) {
				System.out.println("TroyMartian");
			} else if (a <= 6 && b >= 2 && i == 1) {
				System.out.println("VladSaturnian");
			} else if (a <= 2 && b <= 3 && i == 2) {
				System.out.println("GraemeMercurian");
			}
		}

	}
}
