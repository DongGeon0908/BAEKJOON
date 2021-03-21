import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			int s = scan.nextInt();
			int n = scan.nextInt();

			while (n-- > 0) {
				int q = scan.nextInt();
				int p = scan.nextInt();

				s = s + p * q;
			}

			System.out.println(s);
		}

	}
}
