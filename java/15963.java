import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		String data[] = tmp.split(" ");

		if (data[0].equals(data[1])) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}
}
