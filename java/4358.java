import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Integer> data = new TreeMap<>();

		int all = 0;
		while (true) {
			String tmp = br.readLine();
			if (tmp == null || tmp.length() == 0) {
				break;
			} else {
				if (data.containsKey(tmp)) {
					data.put(tmp, data.get(tmp) + 1);
				} else {
					data.put(tmp, 1);
				}
				all++;
			}
		}

		for (String i : data.keySet()) {
			double cnp = (double) data.get(i) / all * 100;

			bw.write(i + " " + String.format("%.4f", cnp) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
