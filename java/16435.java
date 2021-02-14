import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L = scan.nextInt();
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scan.nextInt();
		}
		Arrays.sort(data);

		for (int i = 0; i < N; i++) {
			if (L >= data[i]) {
				L = L + 1;
			} else {
				break;
			}
		}
		System.out.println(L);
	}
}
