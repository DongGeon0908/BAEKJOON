import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int N = scan.nextInt();
		int M = scan.nextInt();

		int result = M - N * K;

		if (result >= 0) {
			System.out.println(0);
		} else {
			System.out.println(result * -1);
		}
	}
}
