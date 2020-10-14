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
		int A = scan.nextInt();
		int B = scan.nextInt();

		// 최대공약수
		System.out.println(gcd(A, B));

		// 최소공배수
		System.out.println(lcm(A, B, gcd(A, B)));
	}
}
