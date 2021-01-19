import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();

		for (int i = 0; i < Integer.parseInt(N); i++) {
			String tmp = scan.nextLine();
			String result = "";

			for (int j = 0; j < tmp.length(); j++) {
				if ((int) tmp.charAt(j) <= 90) {
					char cnp = (char) ((int) tmp.charAt(j) + 32);
					result = result + String.valueOf(cnp);
				} else {
					result = result + tmp.charAt(j);
				}
			}
			System.out.println(result);
		}
	}
}
