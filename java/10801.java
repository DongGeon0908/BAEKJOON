import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] A = scan.nextLine().split(" ");
		String[] B = scan.nextLine().split(" ");

		int resultA = 0;
		int resultB = 0;
		for (int i = 0; i < 10; i++) {
			if (Integer.parseInt(A[i]) > Integer.parseInt(B[i])) {
				resultA = resultA + 1;
			} else if (Integer.parseInt(A[i]) < Integer.parseInt(B[i])) {
				resultB = resultB + 1;
			}
		}

		if (resultA > resultB) {
			System.out.println("A");
		} else if (resultA < resultB) {
			System.out.println("B");
		} else {
			System.out.println("D");
		}
	}
}
