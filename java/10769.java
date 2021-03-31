import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();

		int happy = tmp.split(":-\\)").length - 1;
		int sad = tmp.split(":-\\(").length - 1;

		if (happy > sad) {
			System.out.println("happy");
		} else if (sad > happy) {
			System.out.println("sad");
		} else if (sad == 0 && happy == 0) {
			System.out.println("none");
		} else {
			System.out.println("unsure");
		}
	}
}
