import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 'D' && S.charAt(i) <= 'Z') {
				System.out.print((char) (S.charAt(i) - 3));
			} else {
				if (S.charAt(i) == 'A') {
					System.out.print("X");
				} else if (S.charAt(i) == 'B') {
					System.out.print("Y");
				} else {
					System.out.print("Z");
				}
			}
		}
	}
}
