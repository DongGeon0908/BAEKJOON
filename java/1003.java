import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[41][2];

		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;

		for (int i = 2; i < 41; i++) {
			for (int j = 0; j < 2; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i - 2][j];
			}
		}

		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			bw.write(dp[Integer.parseInt(tmp)][0] + " " + dp[Integer.parseInt(tmp)][1] + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
