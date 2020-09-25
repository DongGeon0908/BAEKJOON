import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnp = 0;
		int tmp = 0;
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scan.nextInt();
		}

		int compare = data[0];
		for (int i = 1; i < N; i++) {
			if (compare < data[i]) {
				tmp = tmp + 1;
				compare = data[i];
			}
		}

		compare = data[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			if (data[i] > compare) {
				cnp = cnp + 1;
				compare = data[i];
			}
		}

		System.out.println((tmp + 1) + "\n" + (cnp + 1));
	}
}
