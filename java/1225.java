import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] data = scan.nextLine().split(" ");

		long result = 0;
		for (int i = 0; i < data[0].length(); i++) {
			for (int j = 0; j < data[1].length(); j++) {
				result = result
						+ Integer.parseInt(data[0].substring(i, i + 1)) * Integer.parseInt(data[1].substring(j, j + 1));
			}
		}
		System.out.print(result);
	}
}
