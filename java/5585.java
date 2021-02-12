import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 1000 - n;
		int result = 0;

		while (true) {
			if (m == 0) {
				System.out.println(result);
				break;
			}

			if (m >= 500) {
				m = m - 500;
				result = result + 1;
			} else if (m >= 100) {
				m = m - 100;
				result = result + 1;
			} else if (m >= 50) {
				m = m - 50;
				result = result + 1;
			} else if (m >= 10) {
				m = m - 10;
				result = result + 1;
			} else if (m >= 5) {
				m = m - 5;
				result = result + 1;
			} else if (m >= 1) {
				m = m - 1;
				result = result + 1;
			}

		}
	}
}
