import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		String[] num = data.split("\\s");
		int result = 0;

		if (Integer.parseInt(num[1]) >= Integer.parseInt(num[2])) {
			result = -1;
		} else {
			result = Integer.parseInt(num[0]) * (-1) / (Integer.parseInt(num[1]) - Integer.parseInt(num[2])) + 1;
		}

		System.out.print(result);

	}
}
