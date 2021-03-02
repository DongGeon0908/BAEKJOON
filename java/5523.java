import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int resultA = 0;
		int resultB = 0;
		for (int i = 0; i < N; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			if (A > B) {
				resultA = resultA + 1;
			} else if (B > A) {
				resultB = resultB + 1;
			}
		}
		System.out.println(resultA + " " + resultB);
	}
}
