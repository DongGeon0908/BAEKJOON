import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<String> stack = new Stack<>();

		String data = bf.readLine();

		for (int i = 0; i < data.length(); i++) {
			stack.push(String.valueOf(data.charAt(i)));
		}
		int cursor = stack.size();

		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {
			String tmp = bf.readLine();
			if (tmp.equals("L")) {
				if (cursor != 0) {
					cursor -= 1;
				}
			} else if (tmp.equals("D")) {
				if (cursor != stack.size()) {
					cursor += 1;
				}
			} else if (tmp.equals("B")) {
				if (cursor != 0) {
					stack.remove(cursor - 1);
				}
			} else {
				String[] cnp = tmp.split(" ");
				stack.add(cursor, cnp[1]);
			}
		}

		for (String s : stack) {
			bw.write(s);
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
