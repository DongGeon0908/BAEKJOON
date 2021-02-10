import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String tmp = scan.nextLine();
			if (tmp.equals("0 0 0 0")) {
				break;
			}

			String[] data = tmp.split(" ");

			int min = Integer.parseInt(data[2]) - Integer.parseInt(data[1]);
			int max = Integer.parseInt(data[3]) - Integer.parseInt(data[0]);

			if (min < 0) {
				min = min * -1;
			}

			if (max < 0) {
				max = max * -1;
			}

			System.out.println(min + " " + max);
		}
	}
}
