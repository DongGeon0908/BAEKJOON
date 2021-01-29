import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		if (N.substring(0, 3).equals("555")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
