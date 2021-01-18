import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();

		for (int i = 0; i < Integer.parseInt(n); i++) {
			String[] tmp = (scan.nextLine()).split(" ");
			System.out.print("Distances: ");
			for (int j = 0; j < tmp[0].length(); j++) {
				if ((int) (tmp[1].charAt(j)) >= (int) (tmp[0].charAt(j))) {
					int result = (int) (tmp[1].charAt(j)) - (int) (tmp[0].charAt(j));
					System.out.print(result + " ");
				} else {
					int result = (int) (tmp[1].charAt(j)) + 26 - (int) (tmp[0].charAt(j));
					System.out.print(result + " ");
				}
			}
			System.out.println();
		}
	}
}
