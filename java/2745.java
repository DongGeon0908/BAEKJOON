import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] data = scan.nextLine().split(" ");

		int result = Integer.parseInt(data[0], Integer.parseInt(data[1]));

		System.out.println(result);
	}
}
