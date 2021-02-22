import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int Y = 0;
			int K = 0;

			for (int j = 0; j < 9; j++) {
				Y = Y + scan.nextInt();
				K = K + scan.nextInt();
			}

			if (Y > K) {
				System.out.println("Yonsei");
			} else if (K > Y) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
		}

	}
}
