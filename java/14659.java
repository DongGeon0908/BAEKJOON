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

		int N = Integer.parseInt(bf.readLine());
		String[] data = bf.readLine().split(" ");
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (result > (N - i)) {
				break;
			}

			int tmp = 0;
			for (int j = i + 1; j < N; j++) {
				if (Integer.parseInt(data[i]) > Integer.parseInt(data[j])) {
					tmp++;
				} else {
					break;
				}
			}

			result = Math.max(result, tmp);
		}
		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		bf.close();

	}
}
