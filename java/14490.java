import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] tmp = scan.nextLine().split(":");
		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);

		int cnp = gcd(n, m);

		System.out.println(n / cnp + ":" + m / cnp);

	}

	// 유클리드 호제법
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}

}
