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

		while (true) {
			int n = Integer.parseInt(bf.readLine());
			if (n == 0) {
				break;
			} else {
				TreeMap<String, String> data = new TreeMap<>();
				for (int i = 0; i < n; i++) {
					String tmp = bf.readLine();
					data.put(tmp.toLowerCase(), tmp);
				}
				bw.write(data.get(data.firstKey()) + "\n");
			}
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
