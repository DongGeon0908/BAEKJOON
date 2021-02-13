import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;

		while (true) {
			if (n == 0) {
				System.out.print(result);
				break;
			}

			if (n == 1) {
				System.out.print(-1);
				break;
			}

			if (n >= 5 && n != 6 && n != 8) {
				n = n - 5;
				result = result + 1;
			} else {
				n = n - 2;
				result = result + 1;
			}

		}

	}
}
