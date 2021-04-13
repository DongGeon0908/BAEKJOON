import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextInt();
		long B = scan.nextInt();

		long result = (A + B) * (A - B);

		System.out.print(result);

	}
}
