import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data[] = new int[8];

		for (int i = 0; i < 8; i++) {
			data[i] = scan.nextInt();
		}

		int[] human = new int[4];
		int result = 0;
		for (int i = 0; i < 4; i++) {
			result = result - data[2 * i] + data[2 * i + 1];
			human[i] = result;
		}

		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (human[j] > human[j + 1]) {
					int tmp = human[j];
					human[j] = human[j + 1];
					human[j + 1] = tmp;
				}
			}
		}
		System.out.println(human[3]);

	}
}
