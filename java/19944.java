import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		if (M == 1 || M == 2) {
			System.out.print("NEWBIE!");
		} else if (M <= N && (M != 1 || M != 2)) {
			System.out.print("OLDBIE!");
		} else {
			System.out.print("TLE!");
		}

	}
}
