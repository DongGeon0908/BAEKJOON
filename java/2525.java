import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int C = scan.nextInt();

		H = (H + (M + C) / 60) % 24;
		M = (M + C) % 60;

		System.out.println(H + " " + M);

	}
}
