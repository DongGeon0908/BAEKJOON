import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 스택 문제를 풀때는 추가하고 삭제하면서 문제가 발생하면 break!
// 스택에 최종적으로 데이터가 남는지, 없는지 확인!!

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String input = bf.readLine();

			// 종료조건
			if (input.equals(".")) {
				break;
			}

			// 담을 그릇
			Stack<String> stack = new Stack<String>();

			String result = "yes";

			// Stack에 데이터 삽입하고 삭제하고
			for (int i = 0; i < input.length(); i++) {

				if (input.charAt(i) == '[' || input.charAt(i) == '(') {
					stack.push(String.valueOf(input.charAt(i)));
				} else if (input.charAt(i) == ']') {
					if (stack.isEmpty() || !stack.peek().equals("[")) {
						result = "no";
						break;
					} else {
						stack.pop();
					}
				} else if (input.charAt(i) == ')') {
					if (stack.isEmpty() || !stack.peek().equals("(")) {
						result = "no";
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (!stack.isEmpty()) {
				result = "no";
			}

			bw.write(result + "\n");

		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
