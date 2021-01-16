import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int result = 0;
			for (int j = 0; j < N; j++) {
				int tmp = scan.nextInt();
				result = result + tmp;
			}
			System.out.println(result);
		}
	}
}
