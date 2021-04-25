import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] data = new int[10];
		int avg = 0;
		int[] tmp = new int[100];
		tmp[0] = 0;
		for (int i = 0; i < 10; i++) {
			data[i] = scan.nextInt();
			tmp[data[i] / 10]++;
			avg += data[i];
		}

		System.out.println(avg / 10);

		int max = 0;
		int result = 0;
		for (int i = 0; i < 100; i++) {
			if (tmp[i] > max) {
				max = tmp[i];
				result = i;
			}
		}

		System.out.println(result * 10);

	}
}
