import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static ArrayList<Integer>[] data;
	static int N;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int M = scan.nextInt();
		int startV = scan.nextInt();

		data = new ArrayList[N + 1];

		for (int i = 1; i < N + 1; i++) {
			data[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			int U = scan.nextInt();
			int V = scan.nextInt();

			data[U].add(V);
			data[V].add(U);
		}
		for (int i = 1; i < N + 1; i++) {
			Collections.sort(data[i]);
		}
		check = new boolean[N + 1];
		dfs(startV);
		System.out.println();

		check = new boolean[N + 1];
		bfs(startV);
		System.out.println();

		scan.close();
	}

	private static void dfs(int x) {
		if (check[x] == true) {
			return;
		}

		check[x] = true;
		System.out.print(x + " ");
		for (int y : data[x]) {
			if (check[y] == false) {
				dfs(y);
			}
		}

	}

	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		check[start] = true;

		while (queue.isEmpty() == false) {
			int x = queue.poll();
			System.out.print(x + " ");
			for (int y : data[x]) {
				if (check[y] == false) {
					check[y] = true;
					queue.add(y);
				}
			}
		}
	}
}
