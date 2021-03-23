import java.util.*;

public class Main {
	static int ans = 0;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		hanoi(num, 1, 2, 3);
		System.out.println(ans);
		System.out.println(sb);

	}

	public static void hanoi(int n, int from, int by, int to) {
		ans++;

		// 원판 하나
		if (n == 1) {
			sb.append(from + " " + to + "\n");
			return;
		} else {
			// 원판 1 -> 2
			hanoi(n - 1, from, to, by);

			// 원판 1 -> 3
			sb.append(from + " " + to + "\n");

			// 원판 2 -> 3
			hanoi(n - 1, by, from, to);
		}

	}
}
