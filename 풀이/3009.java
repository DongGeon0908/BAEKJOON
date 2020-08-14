import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[6];

		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextInt();
		}

		int[] X = new int[3];
		int t = 0;
		for (int i = 0; i < data.length; i = i + 2) {
			X[t] = data[i];
			t++;
		}

		int[] Y = new int[3];
		int k = 0;
		for (int i = 1; i < data.length; i = i + 2) {
			Y[k] = data[i];
			k++;
		}

		for (int i = 0; i < 3; i++) {
			int tmp = 0;
			for (int j = 0; j < 3; j++) {
				if (X[i] == X[j]) {
					tmp++;
				}
			}
			if (tmp != 2) {
				System.out.print(X[i] +" ");
			}
		}

		for (int i = 0; i < 3; i++) {
			int tmp = 0;
			for (int j = 0; j < 3; j++) {
				if (Y[i] == Y[j]) {
					tmp++;
				}
			}
			if (tmp != 2) {
				System.out.print(Y[i]);
			}
		}

	}

}
