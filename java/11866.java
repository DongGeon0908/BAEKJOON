import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		System.out.print("<");
		while (q.isEmpty() == false) {
			for (int i = 0; i < k - 1; i++) {
				int val = q.poll();
				q.offer(val);
			}
			System.out.print(q.poll());
			if (q.size() >= 1) {
				System.out.print(", ");
			}
		}
		System.out.print(">");
	}
}
