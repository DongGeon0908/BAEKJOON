import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		if (N == 1) {
			System.out.println(1);
		} else {
			String tmp = Integer.toBinaryString(N);

			int check = 0;
			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) == '1') {
					check = check + 1;
				}

				if (check >= 2) {
					break;
				}
			}

			if (check == 1) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}
}
