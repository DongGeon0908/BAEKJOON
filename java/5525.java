import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int M = Integer.parseInt(scan.nextLine());
		char[] S = scan.nextLine().toCharArray();

		int result = 0;
		int tmp = 0;

		for (int i = 1; i < M - 1; i++) {
			if (S[i - 1] == 'I' && S[i] == 'O' && S[i + 1] == 'I') {
				tmp = tmp + 1;
				if (tmp == N) {
					tmp = tmp - 1;
					result = result + 1;
				}
				i = i + 1;
			} else {
				tmp = 0;
			}

		}
		System.out.println(result);
	}
}
