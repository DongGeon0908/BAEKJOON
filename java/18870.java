import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[] T = (br.readLine()).split(" ");
		long[] data = new long[N];
		long[] tmp = new long[N];

		for (int i = 0; i < N; i++) {
			data[i] = Long.parseLong(T[i]);
			tmp[i] = data[i];
		}

		Arrays.sort(tmp);

		int cnp = 0;
		Map<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			if (map.get(tmp[i]) == null) {
				map.put(tmp[i], cnp++);
			}
		}

		for (int i = 0; i < N; i++) {
			bw.append(map.get(data[i]) + " ");
		}
		bw.close();

	}
}
