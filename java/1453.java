import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] data = new int[count];
		int reject = 0;
		for (int i = 0; i < count; i++) {
			int tmp = scan.nextInt();
			int time = 0;
			for (int j = 0; j <= i; j++) {
				if (data[j] == tmp) {
					reject = reject + 1;
					break;
				} else {
					time = 1;
				}
			}
			if (time == 1) {
				data[i] = tmp;
			}
		}
		System.out.print(reject);
	}
}
