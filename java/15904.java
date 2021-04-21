import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		char[] tmp = { 'U', 'C', 'P', 'C' };
		int index = 0;

		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == tmp[index]) {
				index = index + 1;
			}

			if (index == 4) {
				break;
			}
		}

		if (index == 4) {
			System.out.println("I love UCPC");
		} else {
			System.out.println("I hate UCPC");
		}

	}
}
