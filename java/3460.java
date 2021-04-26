import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		while (T-- > 0) {
			int n = scan.nextInt();
			String result = Integer.toBinaryString(n);
			int j = 0;
			for (int i = result.length() - 1; i >= 0; i--) {
				if (result.charAt(i) == '1') {
					System.out.print(j + " ");
				}
				j++;
			}

		}

	}
}
