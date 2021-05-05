import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		int n = Integer.parseInt(bf.readLine());

		while (n-- > 0) {
			String str = bf.readLine().toLowerCase();
			StringBuffer sb = new StringBuffer(str);
			String reverseStr = sb.reverse().toString();

			if (str.equals(reverseStr)) {
				bw.write("Yes\n");
			} else {
				bw.write("No\n");
			}
		}

		bw.flush();
		bw.close();
		bf.close();

	}
}
