import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] test = new String[Integer.parseInt(num)];

		for (int i = 0; i < Integer.parseInt(num); i++) {
			test[i] = scan.nextLine();
		}
		for (int i = 0; i < Integer.parseInt(num); i++) {
			int result = 0;
			int increase = 1;
			for (int j = 0; j < test[i].length(); j++) {
				if (test[i].substring(j, j + 1).equals("O")) {
					result = result + increase;
					increase = increase + 1;
				} else {
					increase = 1;
				}
			}
			System.out.println(result);
		}

	}
}
