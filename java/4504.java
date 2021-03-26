import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		while (true) {
			int tmp = scan.nextInt();
			if (tmp == 0) {
				break;
			} else {
				if (tmp % N == 0) {
					System.out.println(tmp + " is a multiple of " + N + ".");
				} else {
					System.out.println(tmp + " is NOT a multiple of " + N + ".");
				}
			}
		}
	}
}
