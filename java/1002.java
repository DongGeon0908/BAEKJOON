import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		String result = "";
		for (int i = 0; i < T; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();

			int dp = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				result = result + -1 + "\n";
			} else if (dp > Math.pow(r1 + r2, 2) || dp < Math.pow(r2 - r1, 2)) {
				result = result + 0 + "\n";
			} else if (dp == Math.pow(r2 - r1, 2) || dp == Math.pow(r1 + r2, 2)) {
				result = result + 1 + "\n";
			} else {
				result = result + 2 + "\n";
			}

		}
		System.out.print(result);
	}
}
