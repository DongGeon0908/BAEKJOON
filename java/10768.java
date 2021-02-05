import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int D = scan.nextInt();

		if (M == 2 && D == 18) {
			System.out.println("Special");
		} else if (M > 2) {
			System.out.println("After");
		} else if (M == 2 && D > 18) {
			System.out.println("After");
		} else {
			System.out.println("Before");
		}
	}
}
