import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();

		if (L % 5 != 0) {
			System.out.print(L / 5 + 1);
		} else {
			System.out.print(L / 5);
		}
	}

}
