import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		int N = Integer.parseInt(bf.readLine());

		TreeMap<String, String> data = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			String[] tmp = bf.readLine().split(" ");

			if (!data.containsKey(tmp[0])) {
				data.put(tmp[0], tmp[1]);
			} else {
				data.remove(tmp[0]);
			}
		}

		for (String i : data.keySet()) {
			bw.write(i + "\n");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
