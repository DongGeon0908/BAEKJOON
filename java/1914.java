import java.math.*;
import java.util.Scanner;

public class Main {

	public static void hanoi(int n, int start, int mid, int end) {
		if (n == 1) {
			System.out.println(start + " " + end);
			return;
		}
		hanoi(n - 1, start, end, mid);
		System.out.println(start + " " + end);
		hanoi(n - 1, mid, start, end);
		return;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		BigInteger tmp = new BigInteger("2");
		BigInteger cnp = tmp.pow(N).subtract(BigInteger.ONE);
		System.out.println(cnp);
		if (N <= 20) {
			hanoi(N, 1, 2, 3);
		}
	}
}
