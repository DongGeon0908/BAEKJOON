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

		String S = bf.readLine();
		Stack<Character> stack = new Stack<>();

		boolean check = false;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '<') {
				check = true;

				while (!stack.isEmpty()) {
					bw.write(stack.pop());
				}
				bw.write(S.charAt(i));
			} else if (S.charAt(i) == '>') {
				check = false;
				bw.write(S.charAt(i));
			} else if (check) {
				bw.write(S.charAt(i));
			} else if (!check) {
				if (S.charAt(i) == ' ') {
					while (!stack.isEmpty()) {
						bw.write(stack.pop());
					}

					bw.write(S.charAt(i));
				} else {
					stack.push(S.charAt(i));
				}
			}
		}

		while (!stack.isEmpty()) {
			bw.write(stack.pop());
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
