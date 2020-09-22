import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String test1 = scan.nextLine();
		String test2 = scan.nextLine();

		if (test1.length() >= test2.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}

	}
}
