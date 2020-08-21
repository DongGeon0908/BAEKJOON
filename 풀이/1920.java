import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] nData = new int[N];
		for (int i = 0; i < N; i++) {
			nData[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int[] mData = new int[M];
		for (int i = 0; i < M; i++) {
			int tmp = scan.nextInt();
			for (int j = 0; j < N; j++) {
				if (nData[j] == tmp) {
					mData[i] = 1;
					break;
				} else {
					mData[i] = 0;
				}
			}
		}
		for (int i : mData) {
			System.out.println(i);
		}
	}
}
