import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String X = scan.nextLine();

		if (X.contains("0x")) {
			System.out.println(Integer.parseInt(X.substring(2, X.length()), 16));
		} else if (X.substring(0, 1).equals("0")) {
			System.out.println(Integer.parseInt(X, 8));
		} else {
			System.out.println(X);
		}

	}
}
