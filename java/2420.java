import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();

		if ((a - b) > 0) {
			System.out.print(a - b);
		} else {
			System.out.print((a - b) * -1);
		}
	}
}
