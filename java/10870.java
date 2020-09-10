import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = 0;
		if (num == 0) {
			System.out.println(num);
		} else if (num == 1) {
			System.out.println(num);
		} else {
			int[] data = new int[num + 1];
			data[0] = 0;
			data[1] = 1;

			for (int i = 2; i < num + 1; i++) {
				data[i] = data[i - 1] + data[i - 2];
			}

			System.out.println(data[num]);
		}
	}
}
