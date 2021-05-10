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

		String N = bf.readLine();

		String check = "NO";
		for (int i = 1; i < N.length(); i++) {
			String A = N.substring(0, i);
			String B = N.substring(i, N.length());

			int N_A = 1;
			for (int j = 0; j < A.length(); j++) {
				N_A *= Integer.parseInt(A.substring(j, j + 1));
			}

			int N_B = 1;
			for (int j = 0; j < B.length(); j++) {
				N_B *= Integer.parseInt(B.substring(j, j + 1));
			}

			if (N_A == N_B) {
				check = "YES";
				break;
			}

		}

		bw.write(check);

		bw.flush();
		bw.close();
		bf.close();
	}
}
