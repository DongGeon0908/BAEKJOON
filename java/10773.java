import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[] data = new int[count];
		for (int i = 0; i < count; i++) {
			data[i] = scan.nextInt();
			if (data[i] == 0) {
				for (int j = i - 1; j >= 0; j--) {
					if (data[j] != 0) {
						data[j] = 0;
						break;
					}
				}
			}
		}

		int result = 0;
		for (int a : data) {
			result = result + a;
		}

		System.out.print(result);
	}
}
