import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] data = new String[Integer.parseInt(N)];

		for (int i = 0; i < Integer.parseInt(N); i++) {
			data[i] = scan.nextLine();
		}
		String K = scan.nextLine();

		if (K.equals("1")) {
			for (String a : data) {
				System.out.println(a);
			}
		} else if (K.equals("2")) {
			for (int i = 0; i < Integer.parseInt(N); i++) {
				for (int j = data[i].length() - 1; j >= 0; j--) {
					System.out.print(data[i].charAt(j));
				}
				System.out.println();
			}
		} else if (K.equals("3")) {
			for (int i = Integer.parseInt(N) - 1; i >= 0; i--) {
				System.out.println(data[i]);
			}
		}

	}
}
