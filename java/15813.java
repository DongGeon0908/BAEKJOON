import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		String tmp = scan.nextLine();

		int result = 0;

		for (int i = 0; i < Integer.parseInt(n); i++) {
			result = result + ((int) tmp.charAt(i) - 64);
		}
		System.out.println(result);
	}
}
