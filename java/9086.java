import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();

		String[] data = new String[Integer.parseInt(N)];
		for (int i = 0; i < Integer.parseInt(N); i++) {
			data[i] = scan.nextLine();
		}

		for (int i = 0; i < Integer.parseInt(N); i++) {
			System.out.println(data[i].substring(0, 1) + data[i].substring(data[i].length() - 1, data[i].length()));
		}

	}

}
