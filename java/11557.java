import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		int T = Integer.parseInt(bf.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(bf.readLine());
			Map<Integer, String> data = new HashMap<>();
			while (N-- > 0) {
				StringTokenizer st = new StringTokenizer(bf.readLine());

				String S = st.nextToken();
				int L = Integer.parseInt(st.nextToken());

				data.put(L, S);
			}
			TreeMap sort = new TreeMap(data);
			System.out.println(data.get(sort.lastKey()));
		}

	}
}
