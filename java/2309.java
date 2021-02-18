import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[9];
		boolean check = false;
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			data[i] = scan.nextInt();
			sum = sum + data[i];
		}
		Arrays.sort(data);

		for (int i = 0; i < 9; i++) {
			if (check == true) {
				for (int k : data) {
					if (k != 0) {
						System.out.println(k);
					}
				}
				break;
			}
			for (int j = 0; j < 9; j++) {
				if (i == j) {
					continue;
				} else {
					if ((sum - data[i] - data[j]) == 100) {
						check = true;
						data[i] = 0;
						data[j] = 0;
						break;
					}
				}
			}
		}
	}
}
