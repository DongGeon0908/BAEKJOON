import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		/*
		 * 해당 문제는 양방향으로 IN-OUT이 가능한 자료구조를 사용해야 한다. 가장 적합한 자료구조는 DEQUE이다.
		 */

		// 0. 입력값
		int N = Integer.parseInt(bf.readLine());

		// 1. 데이터를 담을 그릇
		Deque<Integer> data = new ArrayDeque();

		// 2. 데이터 담기
		for (int i = 1; i <= N; i++) {
			data.addLast(i);
		}

		// 3. 문제 해결
		while (data.size() != 1) {
			// 가장 앞에 있는 값 지우기!
			bw.write(Integer.toString(data.pollFirst()) + " ");

			// 가장 앞에 있는 값을 반환하고, 지우기
			int tmp = data.pollFirst();

			// 가장 뒤에 값을 추가하기
			data.addLast(tmp);
		}
		bw.write(Integer.toString(data.pollFirst()));

		bw.flush();
		bw.close();
		bf.close();
	}
}
