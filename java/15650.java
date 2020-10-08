import java.util.Scanner;

public class Main {

	public static int[] data;
	public static int N, M;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		data = new int[M];

		dfs(1, 0);

	}

	public static void dfs(int at, int depth) {

		if (depth == M) {
			for (int val : data) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = at; i <= N; i++) {

			data[depth] = i;
			dfs(i + 1, depth + 1);

		}
	}
}
