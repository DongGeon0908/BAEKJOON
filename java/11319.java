import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		while (N-- > 0) {
			String tmp = scan.nextLine().replace(" ", "");
			int length = tmp.length();

			int cnp = 0;
			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) == 'a' || tmp.charAt(i) == 'A' || tmp.charAt(i) == 'E' || tmp.charAt(i) == 'e'
						|| tmp.charAt(i) == 'I' || tmp.charAt(i) == 'i' || tmp.charAt(i) == 'O' || tmp.charAt(i) == 'o'
						|| tmp.charAt(i) == 'U' || tmp.charAt(i) == 'u') {
					cnp = cnp + 1;
				}
			}
			System.out.println(length - cnp + " " + cnp);
		}
	}
}
