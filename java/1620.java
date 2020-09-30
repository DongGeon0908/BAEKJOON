import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> mapA = new HashMap<>();
		HashMap<Integer, String> mapB = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			mapA.put(s, i + 1);
			mapB.put(i + 1, s);
		}
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (Character.isDigit(s.charAt(0))) {
				int a = Integer.parseInt(s);
				bw.write(mapB.get(a) + "\n");
			} else {
				bw.write(mapA.get(s) + "\n");
			}
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
