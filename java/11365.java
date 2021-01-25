import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String tmp = scan.nextLine();
			if (tmp.equals("END")) {
				break;
			}

			for (int i = tmp.length() - 1; i >= 0; i--) {
				System.out.print(tmp.charAt(i));
			}
			System.out.println();
		}
	}
}
