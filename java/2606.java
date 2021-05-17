import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int map[][]; // 컴퓨터 네트워크
	static boolean visit[]; // 바이러가 전파
	static int n, m;
	static int result = 0;

	public static void main(String[] agrs) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(bf.readLine());
		m = Integer.parseInt(bf.readLine());

		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];

		for (int i = 1; i <= m; i++) {
			String[] tmp = bf.readLine().split(" ");

			int A = Integer.parseInt(tmp[0]);
			int B = Integer.parseInt(tmp[1]);

			map[A][B] = 1;
			map[B][A] = 1;
		}

		dfs(1);

		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		bf.close();
	}

	public static void dfs(int num) {
		visit[num] = true;
		for (int i = 1; i <= n; i++) {
			if (map[num][i] == 1 && !visit[i]) {
				result++;
				dfs(i);
			}
		}
	}

}
