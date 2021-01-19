import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();

		for (int i = 0; i < Integer.parseInt(T); i++) {
			String tmp = scan.nextLine();
			String cnp = scan.nextLine();
			int result = 0;

			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) != cnp.charAt(j)) {
					result = result + 1;
				}
			}
			System.out.println("Hamming distance is " + result + ".");
		}
	}
}
