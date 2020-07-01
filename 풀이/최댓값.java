import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num1 = new int[9];
		for (int i = 0; i < 9; i++) {
			num1[i] = scan.nextInt();
		}

		int[] num2 = new int[9];
		System.arraycopy(num1, 0, num2, 0, 9);
		int tmp;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 - i - 1; j++) {
				if (num2[j] > num2[j + 1]) {
					tmp = num2[j];
					num2[j] = num2[j + 1];
					num2[j + 1] = tmp;
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			if (num1[j] == num2[8]) {
				System.out.println(num1[j]);
				System.out.println(j + 1);
			}
		}

	}
}
