import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] data = new int[count];
		for (int i = 0; i < count; i++) {
			data[i] = scan.nextInt();
		}

		int result = 0;
		for (int i = 0; i < count; i++) {
			int tmp = 0;
			for (int j = 1; j <= data[i]; j++) {
				if (data[i] % j == 0) {
					tmp = tmp + 1;
				}
			}
			if (tmp == 2) {
				result = result + 1;
			}
		}
		System.out.print(result);
	}
}
