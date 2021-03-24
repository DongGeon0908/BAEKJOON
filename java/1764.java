import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<String> hashset = new HashSet<>();
		ArrayList<String> result = new ArrayList<>();

		String[] num = br.readLine().split(" ");

		for (int i = 0; i < Integer.parseInt(num[0]); i++) {
			String tmp = br.readLine();
			hashset.add(tmp);
		}
		for (int i = 0; i < Integer.parseInt(num[1]); i++) {
			String tmp = br.readLine();
			if (hashset.contains(tmp)) {
				result.add(tmp);
			}
		}
		Collections.sort(result);

		bw.write("" + result.size());
		bw.newLine();
		for (String s : result) {
			bw.write(s);
			bw.newLine();
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
