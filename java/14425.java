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
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] num = bf.readLine().split(" ");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);

		Map<String, Integer> S = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			S.put(bf.readLine(), i);
		}

		int result = 0;
		while (M-- > 0) {
			if (S.containsKey(bf.readLine())) {
				result++;
			}
		}

		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		bf.close();
	}
}
