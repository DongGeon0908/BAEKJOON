import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		String[] cnp = tmp.split(" ");

		for (int i = 0; i < Integer.parseInt(cnp[0]); i++) {
			String data = scan.nextLine();
			for (int j = 0; j < Integer.parseInt(cnp[1]); j++) {
				System.out.print(data.charAt(Integer.parseInt(cnp[1]) - 1 - j));
			}
			System.out.println();
		}

	}
}
