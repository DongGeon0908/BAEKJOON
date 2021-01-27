import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		String[] data = tmp.split("0");

		int left = 0;
		int right = 0;

		for (int i = 0; i < data[0].length(); i++) {
			if (data[0].charAt(i) == '@') {
				left = left + 1;
			}
		}

		for (int i = 0; i < data[1].length(); i++) {
			if (data[1].charAt(i) == '@') {
				right = right + 1;
			}
		}

		System.out.println(left + " " + right);

	}
}
