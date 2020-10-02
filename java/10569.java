import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int V = scan.nextInt();
			int E = scan.nextInt();
			int result = 2 - V + E;
			System.out.println(result);
		}
	}
}
