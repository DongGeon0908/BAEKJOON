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

		int N = Integer.parseInt(bf.readLine());

		int result = 0;
		while (N-- > 0) {
			String input = bf.readLine();

			if (input.length() % 2 == 0) {
				String[] data = input.split("");
				Stack<String> stack = new Stack<>();

				for (int i = 0; i < input.length(); i++) {
					if (stack.isEmpty() || !stack.peek().equals(data[i])) {
						stack.push(data[i]);
					} else if (stack.peek().equals(data[i])) {
						stack.pop();
					}
				}

				if (stack.size() == 0) {
					result++;
				}

			}
		}

		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		bf.close();
	}
}
