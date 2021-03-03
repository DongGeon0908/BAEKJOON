import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < N; i++) {
			double tmp = scan.nextDouble();

			int A = 0;
			int B = 0;
			int C = 0;
			int D = 0;
			while (true) {
				if (tmp == 0) {
					break;
				} else {
					if (tmp >= 25) {
						A = A + 1;
						tmp = tmp - 25;
					} else if (tmp >= 10) {
						B = B + 1;
						tmp = tmp - 10;
					} else if (tmp >= 5) {
						C = C + 1;
						tmp = tmp - 5;
					} else if (tmp >= 1) {
						D = D + 1;
						tmp = tmp - 1;
					}
				}
			}
			System.out.println(A + " " + B + " " + C + " " + D);
		}

	}
}
