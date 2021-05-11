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

		long dp[] = new long[36];
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i < N + 1; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i - j - 1];
			}
		}

		bw.write(Long.toString(dp[N]));

		bw.flush();
		bw.close();
		bf.close();
	}
}
