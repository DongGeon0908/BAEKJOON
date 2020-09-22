import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();

		String[] data = new String[Integer.parseInt(N)];
		for (int i = 0; i < Integer.parseInt(N); i++) {
			data[i] = scan.nextLine();
		}

		for (String i : data) {
			String tmp = i.substring(i.length() - 1, i.length());
			if (tmp.equals("0") || tmp.equals("2") || tmp.equals("4") || tmp.equals("6") || tmp.equals("8")) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

	}
}
