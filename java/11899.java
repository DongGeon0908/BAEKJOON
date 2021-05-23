import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = bf.readLine();

		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == '(') {
				stack.push(String.valueOf(input.charAt(i)));
			} else {
				if (stack.isEmpty() || !stack.peek().equals("(")) {
					stack.push(String.valueOf(input.charAt(i)));
				} else {
					stack.pop();
				}
			}
		}

		bw.write(String.valueOf(stack.size()));

		bw.flush();
		bw.close();
		bf.close();
	}
}
