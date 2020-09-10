import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[] data = new int[count * 2];
		for (int i = 0; i < count * 2; i++) {
			data[i] = scan.nextInt();
		}

		int Q1 = 0;
		int Q2 = 0;
		int Q3 = 0;
		int Q4 = 0;
		int AXIS = 0;

		for (int j = 0; j < count; j++) {
			if (data[2 * j] == 0 || data[2 * j + 1] == 0) {
				AXIS = AXIS + 1;
			} else if (data[2 * j] > 0 && data[2 * j + 1] > 0) {
				Q1 = Q1 + 1;
			} else if (data[2 * j] < 0 && data[2 * j + 1] > 0) {
				Q2 = Q2 + 1;
			} else if (data[2 * j] < 0 && data[2 * j + 1] < 0) {
				Q3 = Q3 + 1;
			} else if (data[2 * j] > 0 && data[2 * j + 1] < 0) {
				Q4 = Q4 + 1;
			}
		}
		System.out.println("Q1: " + Q1);
		System.out.println("Q2: " + Q2);
		System.out.println("Q3: " + Q3);
		System.out.println("Q4: " + Q4);
		System.out.println("AXIS: " + AXIS);
	}
}
