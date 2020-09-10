import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();

		String[] time_int = time.split("\\s");
		int hour = Integer.parseInt(time_int[0]);
		int minutes = Integer.parseInt(time_int[1]);
		int select = hour * 60 + minutes - 45;

		if (select < 0) {
			System.out.println(23 + " " + (60 - select % 60 * (-1)));
		} else {
			System.out.println(select / 60 + " " + select % 60);
		}
	}
}
