import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		String[] data = new String[N];

		for (int i = 0; i < N; i++) {
			data[i] = scan.nextLine();
		}

		Loop: for (int i = 0; i < N; i++) {
			StringBuilder strb = new StringBuilder(data[i]);
			String tmp = strb.reverse().toString();

			for (int j = 0; j < N; j++) {
				if (tmp.equals(data[j])) {
					System.out.println(tmp.length() + " " + data[j].charAt(data[j].length() / 2));
					break Loop;
				}
			}

		}

	}
}
