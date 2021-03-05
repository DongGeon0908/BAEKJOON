import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int tmp = scan.nextInt();
			int cnp = scan.nextInt();

			if (tmp == 0 && cnp == 0) {
				break;
			}
			System.out.println(tmp + cnp);
		}

	}
}
