import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int P = scan.nextInt();

		int resultA = A * P;
		int resultB = 0;

		if (P <= C) {
			resultB = B;
		} else {
			resultB = B + (P - C) * D;
		}

		if (resultA >= resultB) {
			System.out.println(resultB);
		} else {
			System.out.println(resultA);
		}

	}
}
