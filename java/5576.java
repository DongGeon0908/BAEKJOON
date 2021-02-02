import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] a = new int[10];
		int[] b = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);

		for (int i = 0; i < 10; i++) {
			b[i] = scan.nextInt();
		}
		Arrays.sort(b);

		System.out.println((a[9] + a[8] + a[7]) + " " + (b[9] + b[8] + b[7]));

	}
}
