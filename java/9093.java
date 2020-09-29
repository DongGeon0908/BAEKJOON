import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		Stack<Character> st = new Stack<Character>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (N-- > 0) {
			String input = bf.readLine() + "\n";
			for (char tmp : input.toCharArray()) {
				if (tmp == ' ' || tmp == '\n') {
					while (!st.isEmpty()) {
						bw.write(st.pop());
					}
					bw.write(tmp); // 공백
				} else
					st.push(tmp);
			}
		}
		bw.flush();
		return;
	}
}
