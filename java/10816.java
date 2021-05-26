import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");

		int M = Integer.parseInt(br.readLine());
		String[] input2 = br.readLine().split(" ");

		Map<String, Integer> data = new HashMap<>();

		for (int i = 0; i < M; i++) {
			data.put(input2[i], 0);
		}

		for (int i = 0; i < N; i++) {
			if (data.containsKey(input1[i])) {
				data.put(input1[i], data.get(input1[i]) + 1);
			}
		}

		for (int i = 0; i < M; i++) {
			bw.write(data.get(input2[i]) + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
