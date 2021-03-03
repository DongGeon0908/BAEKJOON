import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < N; i++) {
			String[] tmp = scan.nextLine().split(" ");
			double result = Double.parseDouble(tmp[0]);
			for (int j = 1; j < tmp.length; j++) {
				if (tmp[j].equals("@")) {
					result = result * 3;
				} else if (tmp[j].equals("%")) {
					result = result + 5;
				} else if (tmp[j].equals("#")) {
					result = result - 7;
				}
			}
			System.out.printf("%.2f", result);
			System.out.println();
		}

	}
}
