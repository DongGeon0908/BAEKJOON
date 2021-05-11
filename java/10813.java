import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		String[] input = bf.readLine().split(" ");

		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);

		TreeMap<Integer, Integer> data = new TreeMap<>();

		for (int i = 1; i <= N; i++) {
			data.put(i, i);
		}

		for (int i = 0; i < M; i++) {
			String[] tmp = bf.readLine().split(" ");
			int A = Integer.parseInt(tmp[0]);
			int B = Integer.parseInt(tmp[1]);

			int cnp = data.get(A);
			data.put(A, data.get(B));
			data.put(B, cnp);
		}

		for (int i : data.keySet()) {
			bw.write(data.get(i) + " ");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
