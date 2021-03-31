import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String tmp = scan.nextLine();
			boolean[] alpha = new boolean[26];
			if (tmp.equals("#")) {
				break;
			}

			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) >= 65 && tmp.charAt(i) <= 90) {
					alpha[(int) tmp.charAt(i) - 65] = true;
				} else if (tmp.charAt(i) >= 97 && tmp.charAt(i) <= 122) {
					alpha[(int) tmp.charAt(i) - 97] = true;
				}
			}

			int result = 0;
			for (boolean i : alpha) {
				if (i == true) {
					result = result + 1;
				}
			}

			System.out.println(result);

		}
	}
}
