import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		int T = Integer.parseInt(bf.readLine());
		while (T-- > 0) {
			String[] data = bf.readLine().split(" ");
			int n = Integer.parseInt(data[0]);
			int m = Integer.parseInt(data[1]);

			int b = n - 1;
			int a = b - 1;

			int result = 0;
			for (int i = 1; i <= a; i++) {
				for (int j = i + 1; j <= b; j++) {
					if ((Math.pow(i, 2) + Math.pow(j, 2) + m) % (i * j) == 0) {
						result++;
					}
				}
			}
			bw.write(result + "\n");
		}

		bw.flush();
		bw.close();
		bf.close();

	}
}
