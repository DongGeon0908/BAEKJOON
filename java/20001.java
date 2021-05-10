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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		bf.readLine();

		Stack<String> stack = new Stack<>();

		while (true) {
			String tmp = bf.readLine();

			if (tmp.equals("고무오리 디버깅 끝")) {
				break;
			} else if (tmp.equals("문제")) {
				stack.add(tmp);
			} else {
				if (stack.size() == 0) {
					stack.add("문제");
					stack.add("문제");
				} else {
					stack.pop();
				}
			}
		}

		String result = "고무오리야 사랑해";
		if (stack.size() != 0) {
			result = "힝구";
		}

		bw.write(result);

		bw.flush();
		bw.close();
		bf.close();
	}
}
