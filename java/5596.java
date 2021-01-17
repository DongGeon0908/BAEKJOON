import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;

		for (int i = 0; i < 4; i++) {
			a = a + scan.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			b = b + scan.nextInt();
		}

		System.out.println(a >= b ? a : b);
	}
}
