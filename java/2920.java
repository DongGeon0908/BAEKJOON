import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		if (data.equals("1 2 3 4 5 6 7 8")) {
			System.out.print("ascending");
		} else if (data.equals("8 7 6 5 4 3 2 1")) {
			System.out.print("descending");
		} else {
			System.out.print("mixed");
		}
	}
}
