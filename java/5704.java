import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String tmp = scan.nextLine();
			if (tmp.equals("*")) {
				break;
			}

			boolean[] data = new boolean[26];

			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) == ' ') {
					continue;
				} else {
					data[tmp.charAt(i) - 'a'] = true;
				}
			}

			String result = "Y";

			for (boolean i : data) {
				if (i == false) {
					result = "N";
					break;
				}
			}
			System.out.println(result);
		}
	}
}
