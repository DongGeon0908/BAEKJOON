import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int C = scan.nextInt();
			int V = scan.nextInt();

			System.out.println("You get " + (C / V) + " piece(s) and your dad gets " + (C % V) + " piece(s).");
		}

	}
}
