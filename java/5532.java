import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		int result1 = L - A / C;
		int result2 = L - B / D;
		if ((double) A / C > A / C) {
			result1 = L - A / C - 1;
		}

		if ((double) B / D > B / D) {
			result2 = L - B / D - 1;
		}

		System.out.print(result2 > result1 ? result1 : result2);
	}
}
