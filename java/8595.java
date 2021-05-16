import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String tmp = "";
		long result = 0;

		for (int i = 0; i < N; i++) {
			if (str.charAt(i) <= '9' && str.charAt(i) >= '0')
				tmp += str.charAt(i);
			else {
				if (tmp.length() != 0) {
					result += Long.parseLong(tmp);
					tmp = "";
				}
			}
		}

		if (tmp.length() > 0) {
			result += Long.parseLong(tmp);
			tmp = "";
		}

		bw.write(Long.toString(result));
		bw.flush();
	}
}
