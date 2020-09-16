import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();

		int cross = 1;
		int prev = 0;

		while (true) {

			if (X <= prev + cross) {

				if (cross % 2 == 1) {
					System.out.print((cross - (X - prev - 1)) + "/" + (X - prev));
					break;
				}

				else {
					System.out.print((X - prev) + "/" + (cross - (X - prev - 1)));
					break;
				}

			} else {
				prev = prev + cross;
				cross = cross + 1;
			}
		}
	}
}
