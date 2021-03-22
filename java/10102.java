import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] data = scan.nextLine().split("");

		int A = 0;
		int B = 0;
		for (int i = 0; i < Integer.parseInt(N); i++) {
			if (data[i].equals("A")) {
				A = A + 1;
			} else {
				B = B + 1;
			}
		}

		if (A > B) {
			System.out.println("A");
		} else if (B > A) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
	}
}
