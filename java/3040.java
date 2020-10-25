
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] data = new int[9];

		for (int i = 0; i < 9; i++) {
			data[i] = scan.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				int sum = 0;
				for (int k = 0; k < 9; k++) {
					if (k == i || k == j) {
						continue;
					}
					sum = sum + data[k];
				}

				if (sum == 100) {
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j) {
							continue;
						}
						System.out.println(data[k]);
					}
					return;
				}
			}
		}

	}

}
