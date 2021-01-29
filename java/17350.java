import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String result = "뭐야?";

		for (int i = 0; i < Integer.parseInt(N); i++) {
			String tmp = scan.nextLine();

			if (tmp.equals("anj")) {
				result = "뭐야;";
				break;
			}
		}
		System.out.println(result);
	}
}
