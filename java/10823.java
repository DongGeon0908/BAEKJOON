import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String cnp = "";
		while (scan.hasNextLine()) {
			String tmp = scan.nextLine();
			cnp = cnp + tmp;
		}
		scan.close();

		String[] data = cnp.split(",");

		int result = 0;
		for (String i : data) {
			result = result + Integer.parseInt(i);
		}

		System.out.println(result);
	}
}
