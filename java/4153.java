import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		int reset = 0;
		while (true) {
			int input = scan.nextInt();
			if (input != 0) {
				data.add(input);
			} else {
				reset = reset + 1;
			}

			if (reset == 3) {
				break;
			}
		}

		for (int i = 0; i < data.size(); i = i + 3) {
			int a = data.get(i);
			int b = data.get(i + 1);
			int c = data.get(i + 2);

			if (a > b && a > c) {
				if (a * a == b * b + c * c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if (b > a && b > c) {
				if (b * b == a * a + c * c) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if (c > a && c > b) {
				if (c * c == a * a + b * b) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else {
				System.out.println("wrong");
			}

		}

	}
}
