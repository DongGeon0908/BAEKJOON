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
		String[] data = bf.readLine().split("");

		int tmp = 0;
		for (int i = 0; i < n; i++) {
			if (data[i].equals("2")) {
				tmp++;
			}
		}

		n -= tmp;
		if (tmp > n) {
			bw.write("2");
		} else if (tmp < n) {
			bw.write("e");
		} else {
			bw.write("yee");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
