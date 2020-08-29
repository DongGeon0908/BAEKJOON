import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		int result = 0;
		if (data.length() == 2) {
			result = Integer.parseInt(data.substring(0, 1)) + Integer.parseInt(data.substring(1, 2));
		} else if (data.length() == 3) {
			if (Integer.parseInt(data.substring(2, 3)) != 0) {
				result = Integer.parseInt(data.substring(0, 2)) + Integer.parseInt(data.substring(2, 3));
			} else {
				result = Integer.parseInt(data.substring(0, 1)) + Integer.parseInt(data.substring(1, 3));
			}
		} else {
			result = 20;
		}
		System.out.print(result);
	}
}
