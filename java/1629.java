import java.util.Scanner;

public class Main {
	public static void main(String[] ar) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		long result = 1;
		long tmp = A % C;

		while (B > 0) {
			if (B % 2 == 1) {
				result = result * tmp;
				result = result % C;
			}
			tmp = ((tmp % C) * (tmp % C)) % C;
			B = B / 2;
		}
		System.out.print(result);
	}
}
