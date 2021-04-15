import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] data = scan.nextLine().split("");
		int S = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < S; i++) {
			String[] cnp = scan.nextLine().split(" ");

			int A = Integer.parseInt(cnp[0]);
			int B = Integer.parseInt(cnp[1]);

			String tmp = data[A];
			data[A] = data[B];
			data[B] = tmp;
		}

		for (String i : data) {
			System.out.print(i);
		}

	}
}
