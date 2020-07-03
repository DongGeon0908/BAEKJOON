import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] test = new String[Integer.parseInt(num)];

		for (int i = 0; i < Integer.parseInt(num); i++) {
			test[i] = scan.nextLine();
		}

		int[] test_case = new int[Integer.parseInt(num) * 2];
		for (int j = 0; j < Integer.parseInt(num); j++) {

			test_case[j * 2] = Integer.parseInt(test[j].substring(0, 1));
			test_case[j * 2 + 1] = Integer.parseInt(test[j].substring(2, 3));
			System.out.println(test_case[j * 2] + test_case[j * 2 + 1]);
		}

	}
}
