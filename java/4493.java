import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String t = scan.nextLine();

		for (int i = 0; i < Integer.parseInt(t); i++) {
			String n = scan.nextLine();
			int resultA = 0;
			int resultB = 0;
			for (int j = 0; j < Integer.parseInt(n); j++) {
				String tmp = scan.nextLine();
				String[] data = tmp.split(" ");
				if (data[0].equals("R")) {
					if (data[1].equals("P")) {
						resultB = resultB + 1;
					} else if (data[1].equals("S")) {
						resultA = resultA + 1;
					}
				} else if (data[0].equals("P")) {
					if (data[1].equals("S")) {
						resultB = resultB + 1;
					} else if (data[1].equals("R")) {
						resultA = resultA + 1;
					}
				} else if (data[0].equals("S")) {
					if (data[1].equals("R")) {
						resultB = resultB + 1;
					} else if (data[1].equals("P")) {
						resultA = resultA + 1;
					}
				}
			}
			if (resultB > resultA) {
				System.out.println("Player 2");
			} else if (resultB < resultA) {
				System.out.println("Player 1");
			} else {
				System.out.println("TIE");
			}

		}
	}
}
