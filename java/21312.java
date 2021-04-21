import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if (A % 2 != 0 && B % 2 != 0 && C % 2 != 0) {
			System.out.println(A * B * C);
		} else if (A % 2 != 0 && B % 2 != 0) {
			System.out.println(A * B);
		} else if (B % 2 != 0 && C % 2 != 0) {
			System.out.println(B * C);
		} else if (A % 2 != 0 && C % 2 != 0) {
			System.out.println(A * C);
		} else if (A % 2 != 0) {
			System.out.println(A);
		} else if (B % 2 != 0) {
			System.out.println(B);
		} else if (C % 2 != 0) {
			System.out.println(C);
		} else {
			System.out.println(A * B * C);
		}

	}
}
