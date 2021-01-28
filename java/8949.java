import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] data = N.split(" ");

		String result = "";

		if (data[0].length() > data[1].length()) {
			result = result + data[0].substring(0, data[0].length() - data[1].length());

			int q = data[0].length() - data[1].length();

			for (int i = 0; i < data[1].length(); i++) {
				int tmp = Integer.parseInt(data[0].substring(q, q + 1)) + Integer.parseInt(data[1].substring(i, i + 1));
				result = result + Integer.toString(tmp);
				q = q + 1;
			}
		} else {
			result = result + data[1].substring(0, data[1].length() - data[0].length());

			int q = data[1].length() - data[0].length();

			for (int i = 0; i < data[0].length(); i++) {
				int tmp = Integer.parseInt(data[1].substring(q, q + 1)) + Integer.parseInt(data[0].substring(i, i + 1));
				result = result + Integer.toString(tmp);
				q = q + 1;
			}
		}
		System.out.println(result);
	}
}
