import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int tmp = 0;

		while (true) {
			if (N % 5 == 0) {
				System.out.println(N / 5 + tmp);
				break;
			} else if (N < 0) {
				System.out.println(-1);
				break;
			}
			N = N - 3;
			tmp++;
		}
	}

}
