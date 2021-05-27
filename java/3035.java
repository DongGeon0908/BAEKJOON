import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] data = br.readLine().split(" ");
		int R = Integer.parseInt(data[0]);
		int C = Integer.parseInt(data[1]);
		int ZR = Integer.parseInt(data[2]);
		int ZC = Integer.parseInt(data[3]);

		String[][] input = new String[R][C];

		for (int i = 0; i < R; i++) {
			input[i] = br.readLine().split("");
		}

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < R; i++) {
			StringBuffer tmp = new StringBuffer();
			for (int j = 0; j < C; j++) {
				for (int k = 0; k < ZC; k++) {
					tmp.append(input[i][j]);
				}
			}

			for (int j = 0; j < ZR; j++) {
				sb.append(tmp.toString());
				sb.append("\n");
			}

		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();
		br.close();
	}
}
