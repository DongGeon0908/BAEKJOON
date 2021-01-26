import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();

		int result = 1;
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == 'A') {
				if (result == 1) {
					result = 2;
				} else if (result == 2) {
					result = 1;
				}
				continue;
			} else if (n.charAt(i) == 'B') {
				if (result == 2) {
					result = 3;
				} else if (result == 3) {
					result = 2;
				}
				continue;
			} else if (n.charAt(i) == 'C') {
				if (result == 3) {
					result = 1;
				} else if (result == 1) {
					result = 3;
				}
				continue;
			}
		}
		System.out.println(result);
	}
}
