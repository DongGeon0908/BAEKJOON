import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int resultA = 0;
		int resultB = 0;

		for (int i = 0; i < N; i++) {
			int tmp = scan.nextInt();
			int cnp = (tmp / 30 + 1) * 10;
			resultA = resultA + cnp;

			cnp = (tmp / 60 + 1) * 15;
			resultB = resultB + cnp;
		}

		if (resultA > resultB) {
			System.out.print("M " + resultB);
		} else if (resultA < resultB) {
			System.out.print("Y " + resultA);
		} else if (resultA == resultB) {
			System.out.print("Y M " + resultA);
		}
	}
}
