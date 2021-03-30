import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] data = scan.nextLine().split(" ");

		String X = "";
		String Y = "";

		int k = 0;
		for (int i = data[0].length() - 1; i >= 0; i--) {
			if (k == 0 && data[0].charAt(i) != '0') {
				X = X + Character.toString(data[0].charAt(i));
				k = 1;
			}

			else if (k == 1) {
				X = X + Character.toString(data[0].charAt(i));
			}
		}

		k = 0;
		for (int i = data[1].length() - 1; i >= 0; i--) {
			if (k == 0 && data[1].charAt(i) != '0') {
				Y = Y + Character.toString(data[1].charAt(i));
				k = 1;
			}

			else if (k == 1) {
				Y = Y + Character.toString(data[1].charAt(i));
			}
		}

		int cnp = Integer.parseInt(X) + Integer.parseInt(Y);

		String tmp = Integer.toString(cnp);

		k = 0;
		String result = "";
		for (int i = tmp.length() - 1; i >= 0; i--) {
			if (k == 0 && tmp.charAt(i) != '0') {
				result = result + Character.toString(tmp.charAt(i));
				k = 1;
			}

			else if (k == 1) {
				result = result + Character.toString(tmp.charAt(i));
			}
		}

		System.out.println(result);

	}
}
