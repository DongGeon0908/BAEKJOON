import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();

		for (int i = 0; i < Integer.parseInt(n); i++) {
			String tmp = scan.nextLine();

			if (tmp.substring(tmp.length() / 2 - 1, tmp.length() / 2)
					.equals(tmp.substring(tmp.length() / 2, tmp.length() / 2 + 1))) {
				System.out.println("Do-it");
			} else {
				System.out.println("Do-it-Not");
			}
		}

	}
}
