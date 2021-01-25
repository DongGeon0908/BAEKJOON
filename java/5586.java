import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		int num1 = 0;
		int num2 = 0;

		for (int i = 0; i <= data.length() - 3; i++) {
			String tmp = data.substring(i, i + 3);

			if (tmp.equals("JOI")) {
				num1 = num1 + 1;
			}

			if (tmp.equals("IOI")) {
				num2 = num2 + 1;
			}
		}
		System.out.println(num1);
		System.out.println(num2);

	}
}
