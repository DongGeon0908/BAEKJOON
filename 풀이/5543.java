import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int[] a = new int[5];
		int result = 0;
		for (int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		}

		if (a[0] <= a[1] && a[0] <= a[2]) {
			result = a[0];
		} else if (a[1] < a[0] && a[1] < a[2]) {
			result = a[1];
		} else {
			result = a[2];
		}

		if (a[3] >= a[4]) {
			System.out.println(result + a[4] - 50);
		} else {
			System.out.println(result + a[3] - 50);
		}

	}
}
