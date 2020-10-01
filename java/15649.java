import java.util.Scanner;

public class Main {

	public static int[] data;
	public static boolean[] visit;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();

		data = new int[M];
		visit = new boolean[N];
		find(N, M, 0);

	}

	public static void find(int N, int M, int depth) {
		if (depth == M) {
			for (int val : data) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				data[depth] = i + 1;
				find(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}

}
