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

		int N = Integer.parseInt(br.readLine());

		long[] dp = new long[81];

		dp[0] = 0;
		dp[1] = 4;
		dp[2] = 6;

		for (int i = 3; i < 81; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}

		bw.write(String.valueOf(dp[N]));

		bw.flush();
		bw.close();
		br.close();
	}
}
