import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<String> result = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] list = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			list[i] = scan.nextInt();
		}

		int link = 1;

		for (int i = 1; i <= n; i++) {
			stack.push(i);
			result.add("+");
			while (!stack.isEmpty()) {
				// stack의 탑과 리스트가 같은 경우
				if (stack.peek() == list[link]) {
					stack.pop();
					result.add("-");
					link = link + 1;
				} else {
					break;
				}
			}
		}

		if (stack.isEmpty() != true) {
			System.out.println("NO");
		} else {
			for (String cnp : result) {
				System.out.println(cnp);
			}
		}
	}
}
