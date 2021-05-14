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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 폭탄 터짐
		int bomb = 210;

		// 처음 폭탄 든 사람
		int K = Integer.parseInt(bf.readLine());

		// 문제 개수
		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {
			// 범위를 넘어가면 다시 첫번쨰 사람에게로
			if (K == 9) {
				K = 1;
			}

			// data[1]은 결과 P인지 N인지
			String[] data = bf.readLine().split(" ");
			int time = Integer.parseInt(data[0]);

			bomb -= time;

			// 종료 조건
			if (bomb <= 0) {
				bw.write(Integer.toString(K));
				break;
			}

			if (data[1].equals("T")) {
				K++;
			}

		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
