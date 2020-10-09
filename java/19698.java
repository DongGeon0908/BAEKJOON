import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int W = scan.nextInt();
		int H = scan.nextInt();
		int L = scan.nextInt();

		if (N < (W / L) * (H / L)) {
			System.out.print(N);
		} else {
			System.out.print((W / L) * (H / L));
		}

	}
}
