import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int[] data = new int[26];

		for (int i = 0; i < S.length(); i++) {
			data[S.charAt(i) - 'a']++;
		}

		for (int i : data) {
			System.out.print(i + " ");
		}

	}
}
