import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		int result = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) >= 'a' && data.charAt(i) <= 'z') {
				result = result + (int) data.charAt(i) - 96;
			} else {
				result = result + (int) data.charAt(i) - 65 + 27;
			}
		}

		if (result == 1) {
			System.out.println("It is a prime word.");
		} else if (result == 2) {
			System.out.println("It is a prime word.");
		} else {
			for (int i = 2; i < result; i++) {
				if (result % i == 0) {
					System.out.println("It is not a prime word.");
					break;
				} else if (i == result - 1 && result % i != 0) {
					System.out.println("It is a prime word.");
				}
			}
		}
	}
}
