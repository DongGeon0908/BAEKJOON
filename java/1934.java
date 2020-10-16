import java.util.Scanner;

public class Main {

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static int lcm(int a, int b, int c) {
		return (a * b) / c;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		int[] result = new int[T];
		for (int i = 0; i < T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			result[i] = lcm(A, B, gcd(A, B));
		}

		for (int i : result) {
			System.out.println(i);
		}
	}
}
