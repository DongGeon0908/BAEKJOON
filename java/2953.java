import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] data = new int[5];
		for (int i = 0; i < 20; i++) {
			if (i >= 0 && i <= 3) {
				data[0] = data[0] + scan.nextInt();
			} else if (i >= 4 && i <= 7) {
				data[1] = data[1] + scan.nextInt();
			} else if (i >= 8 && i <= 11) {
				data[2] = data[2] + scan.nextInt();
			} else if (i >= 12 && i <= 15) {
				data[3] = data[3] + scan.nextInt();
			} else {
				data[4] = data[4] + scan.nextInt();
			}
		}

		int result = data[0];
		int tmp = 0;
		for (int i = 0; i < 5; i++) {
			if (result < data[i]) {
				result = data[i];
				tmp = i;
			}
		}

		System.out.print(tmp+1 + " " + result);
	}
}
