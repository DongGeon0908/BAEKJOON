import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();

		String[] data = tmp.split(" ");

		int min = Integer.parseInt(data[0].replace("6", "5")) + Integer.parseInt(data[1].replace("6", "5"));
		int max = Integer.parseInt(data[0].replace("5", "6")) + Integer.parseInt(data[1].replace("5", "6"));

		System.out.println(min + " " + max);

	}

}
