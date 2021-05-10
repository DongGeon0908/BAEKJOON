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

		// 해당 문제는 스택을 사용하면 해결할 수 있다! Last In First Out

		// 0. 입력받기
		int N = Integer.parseInt(bf.readLine());

		// 1. 문제해결
		for (int i = 0; i < N; i++) {
			// 문자열 담기
			String[] data = bf.readLine().split(" ");

			// 스택 생성
			Stack<String> stack = new Stack<>();

			// 스택에 문자열 담기
			for (int j = 0; j < data.length; j++) {
				stack.add(data[j]);
			}

			// 스택에 저장된 문자열 끄집어내기
			bw.write("Case #" + (i + 1) + ": ");
			for (int j = 0; j < data.length; j++) {
				bw.write(stack.pop() + " ");
			}
			bw.write("\n");

		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
