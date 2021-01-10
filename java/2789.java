import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		for (int i = 0; i < data.length(); i++) {
			if (data.substring(i, i + 1).equals("C")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("A")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("M")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("B")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("R")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("I")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("D")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("G")) {
				continue;
			}
			if (data.substring(i, i + 1).equals("E")) {
				continue;
			}

			System.out.print(data.substring(i, i + 1));
		}
	}
}
