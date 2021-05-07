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

		int T = Integer.parseInt(bf.readLine());

		while (T-- > 0) {
			int tmp = 0;
			String[] data = bf.readLine().split(" ");
			for (int i = Integer.parseInt(data[0]); i <= Integer.parseInt(data[1]); i++) {
				for (int j = 0; j < Integer.toString(i).length(); j++) {
					if (Integer.toString(i).charAt(j) == '0') {
						tmp++;
					}
				}
			}
			bw.write(Integer.toString(tmp) + "\n");

		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
