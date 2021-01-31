import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		int length = tmp.substring(1, tmp.length() - 1).length();

		System.out.print("h");
		for (int i = 0; i < length * 2; i++) {
			System.out.print("e");
		}
		System.out.print("y");
	}
}
