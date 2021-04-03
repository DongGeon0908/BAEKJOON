import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String[] tmp = scan.nextLine().split(" ");
			if (tmp[0].equals("#")) {
				break;
			}

			int result = 0;
			for (int i = 1; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length(); j++) {
					if (tmp[0].charAt(0) == tmp[i].charAt(j)) {
						result = result + 1;
					} else if ((int) tmp[0].charAt(0) == ((int) tmp[i].charAt(j) + 32)) {
						result = result + 1;
					}
				}
			}
			System.out.println(tmp[0] + " " + result);
		}

	}
}
