import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();

		for (int i = 0; i < Integer.parseInt(N); i++) {
			String[] tmp = (scan.nextLine()).split("-");
			int result = ((int) tmp[0].charAt(0) - 65) * 26 * 26 + ((int) tmp[0].charAt(1) - 65) * 26
					+ ((int) tmp[0].charAt(2) - 65) - Integer.parseInt(tmp[1]);

			if (result < 0) {
				result = result * (-1);
			}

			if (result <= 100) {
				System.out.println("nice");
			} else {
				System.out.println("not nice");
			}
		}
	}
}
