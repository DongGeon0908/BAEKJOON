import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());

		char[][] data = new char[N][N];

		for (int i = 0; i < N; i++) {
			String tmp = bf.readLine();

			for (int j = 0; j < N; j++) {
				data[i][j] = tmp.charAt(j);
			}
		}

		int[] result = new int[2];
		for (int i = 0; i < N; i++) {
			int cnp = 0;
			for (int j = 0; j < N; j++) {
				if (data[i][j] == '.') {
					cnp++;
				} else {
					if (cnp >= 2) {
						result[0]++;
					}
					cnp = 0;
				}

				if (j == N - 1) {
					if (cnp >= 2) {
						result[0]++;
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			int cnp = 0;
			for (int j = 0; j < N; j++) {
				if (data[j][i] == '.') {
					cnp++;
				} else {
					if (cnp >= 2) {
						result[1]++;
					}
					cnp = 0;
				}

				if (j == N - 1) {
					if (cnp >= 2) {
						result[1]++;
					}
				}
			}
		}

		bw.write(Integer.toString(result[0]) + " " + Integer.toString(result[1]));

		bw.flush();
		bw.close();
		bf.close();
	}
}
