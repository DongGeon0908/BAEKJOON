import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String result = "";
		if (N.substring(0, 1).equals("E")) {
			result = "I";
		} else {
			result = "E";
		}

		if (N.substring(1, 2).equals("S")) {
			result = result + "N";
		} else {
			result = result + "S";
		}

		if (N.substring(2, 3).equals("T")) {
			result = result + "F";
		} else {
			result = result + "T";
		}

		if (N.substring(3, 4).equals("J")) {
			result = result + "P";
		} else {
			result = result + "J";
		}
		System.out.println(result);
	}
}
