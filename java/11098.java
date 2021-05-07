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

		int T = Integer.parseInt(bf.readLine());
		while (T-- > 0) {
			int N = Integer.parseInt(bf.readLine());
			TreeMap<Integer, String> tmp = new TreeMap<>();
			while (N-- > 0) {
				String[] cnp = bf.readLine().split(" ");
				tmp.put(Integer.parseInt(cnp[0]), cnp[1]);
			}
			bw.write(tmp.get(tmp.lastKey()) + "\n");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
