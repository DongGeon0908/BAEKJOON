import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] tmp = N.split(" ");

		String result = "false";

		if (tmp[1].equals("AND")) {
			if (tmp[0].equals("true") && tmp[2].equals("true")) {
				result = "true";
			}
		} else if (tmp[1].equals("OR")) {
			if (tmp[0].equals("true") || tmp[2].equals("true")) {
				result = "true";
			}
		}
		System.out.println(result);
	}
}
