import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		int[] M = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] D = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int totalDays = y;
		for (int i = 0; i < x - 1; ++i) {
			totalDays += M[i];
		}

		System.out.println(D[totalDays % 7]);

	}
}
