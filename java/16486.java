import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int d1 = scan.nextInt();
		int d2 = scan.nextInt();

		double result = 2 * d1 + 3.141592 * 2 * d2;

		System.out.print(result);
	}
}
