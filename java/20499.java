import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		String[] data = tmp.split("/");

		if (Integer.parseInt(data[0]) + Integer.parseInt(data[2]) < Integer.parseInt(data[1])
				|| Integer.parseInt(data[1]) == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}
