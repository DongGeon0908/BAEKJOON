import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			int gcd = getGCD(Math.max(a, b), Math.min(a, b));
			int lcm = getLCM(a, b, gcd);

			System.out.println(lcm + " " + gcd);
		}
	}

	public static int getGCD(int a, int b) {
		while (b > 0) {
			int tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}

	public static int getLCM(int a, int b, int gcd) {
		return (a * b) / gcd;
	}

}
