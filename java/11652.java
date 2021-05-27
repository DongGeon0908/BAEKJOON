import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		TreeMap<Long, Integer> data = new TreeMap<>();

		for (int i = 0; i < N; i++) {
			long tmp = Long.parseLong(br.readLine());
			if (data.containsKey(tmp)) {
				data.put(tmp, data.get(tmp) + 1);
			} else {
				data.put(tmp, 1);
			}
		}

		long result = 0;
		int max = 0;
		for (long i : data.keySet()) {
			if (data.get(i) > max) {
				max = data.get(i);
				result = i;
			}
		}

		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();
	}
}
