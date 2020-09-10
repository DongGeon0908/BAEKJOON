import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int[] data = new int[num];
		for (int i = 0; i < num; i++) {
			data[i] = scan.nextInt();
		}
		int result = 0;
		int tmp = 1;
		for (int j = 0; j < num; j++) {
			if (data[j] != tmp) {
				result = result + 1;
			}
			tmp = tmp + 1;
		}
		System.out.print(result);
	}
}
