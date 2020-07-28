import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[10];
		for (int i = 0; i < data.length; i++) {
			int num = scan.nextInt();
			data[i] = num % 42;
		}

		int result = 0;
		for (int i = 0; i < data.length; i++) {
			int tmp = 0;
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] == data[j]) {
					tmp++;
				}
			}
			if (tmp == 0) {
				result++;
			}
		}
		System.out.print(result);
	}
}
