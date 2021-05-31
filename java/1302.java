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

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			if (map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp) + 1);
			} else {
				map.put(tmp, 1);
			}
		}

		int max = 0;
		String key = "";
		for (String i : map.keySet()) {
			if (map.get(i) > max) {
				max = map.get(i);
				key = i;
			}
		}

		bw.write(key);

		bw.flush();
		bw.close();
		br.close();
	}
}
