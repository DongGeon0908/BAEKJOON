import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		String result = "";

		for (int i = 1; i <= n; i++) {
			deque.add(i);
		}

		while (!deque.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				deque.addLast(deque.removeFirst());
			}
			result = result + deque.removeFirst() + ", ";

		}
		System.out.println("<" + result.substring(0, result.length() - 2) + ">");
	}
}
