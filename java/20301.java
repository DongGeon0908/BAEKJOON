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

		String[] data = bf.readLine().split(" ");
		int N = Integer.parseInt(data[0]);
		int K = Integer.parseInt(data[1]);
		int M = Integer.parseInt(data[2]);

		Deque<Integer> tmp = new ArrayDeque<Integer>();

		for (int i = 1; i <= N; i++) {
			tmp.addLast(i);
		}

		int count = 0;

		boolean direction = true;
		while (!tmp.isEmpty()) {
			if (count == M) {
				count = 0;
				if (direction == true) {
					direction = false;
				} else {
					direction = true;
				}
			}

			if (direction == true) {
				for (int i = 1; i < K; i++) {
					tmp.addLast(tmp.removeFirst());
				}
				bw.write(tmp.removeFirst().toString() + "\n");
			} else {
				for (int i = 1; i < K; i++) {
					tmp.addFirst(tmp.removeLast());
				}
				bw.write(tmp.removeLast().toString() + "\n");
			}
			count++;
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
