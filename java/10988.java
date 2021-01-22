import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();

		int result = 1;
		if (tmp.length() % 2 == 0) {
			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
					result = 0;
					break;
				}
			}
		} else {
			for (int i = 0; i < tmp.length(); i++) {
				if (i == tmp.length() / 2) {
					break;
				}

				if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
					result = 0;
					break;
				}
			}
		}
		System.out.println(result);
	}
}
