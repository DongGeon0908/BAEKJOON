import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> leftStack = new Stack<Character>();
		Stack<Character> rightStack = new Stack<Character>();

		String input = br.readLine();

		for (int i = 0; i < input.length(); i++) {
			leftStack.push(input.charAt(i));
		}

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String command = br.readLine();

			// A.startsWith(B) -> A가 B로 시작하는지
			// B.endsWith(B) -> B가 A로 끝나는지

			if (command.startsWith("L")) {
				if (!leftStack.empty()) {
					rightStack.push(leftStack.pop());
				}
			} else if (command.startsWith("D")) {
				if (!rightStack.empty()) {
					leftStack.push(rightStack.pop());
				}
			} else if (command.startsWith("B")) {
				if (!leftStack.empty()) {
					leftStack.pop();
				}
			} else if (command.startsWith("P")) {
				String[] tmp = command.split(" ");

				for (int j = 0; j < tmp[1].length(); j++) {
					leftStack.push(tmp[1].charAt(j));
				}
			}

		}

		while (!leftStack.empty()) {
			rightStack.push(leftStack.pop());
		}

		while (!rightStack.empty()) {
			bw.write(rightStack.pop());
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
