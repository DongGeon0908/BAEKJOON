import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int result = a + b + c;

		if (result == 3 || result == 4) {
			System.out.print(1);
		} else {
			System.out.print(2);
		}
	}
}
