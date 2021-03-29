import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		for (int i = 1; i <= N; i++) {
			String tmp = scan.nextLine();

			System.out.println("String #" + i);
			for (int j = 0; j < tmp.length(); j++) {
				int cnp = 0;
				if (tmp.charAt(j) != 'Z') {
					cnp = tmp.charAt(j) + 1;
				} else {
					cnp = 'A';
				}

				System.out.print((char) cnp);
			}
			System.out.println();
			System.out.println();
		}
	}
}
