import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();

		int O = M;
		int X = N - M;
		int result = 0;

		int XK = N - K;
		if (O >= K) {
			result = K;
			if (X >= XK) {
				result = result + XK;
			} else {
				result = result + X;
			}
		} else {
			result = O;
			if (X >= XK) {
				result = result + XK;
			} else {
				result = result + X;
			}
		}
		System.out.print(result);
	}
}
