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

		String key = bf.readLine();

		int N = Integer.parseInt(bf.readLine());
		int count = 0;
		while (N-- > 0) {
			String tmp = bf.readLine();
			tmp = tmp + tmp + tmp;
			if (tmp.contains(key)) {
				count++;
			}
		}

		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		bf.close();
	}
}
