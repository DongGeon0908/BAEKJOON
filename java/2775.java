import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static int[][] aptAddress = new int[15][15];

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < 15; i++) {
			aptAddress[i][1] = 1;
			aptAddress[0][i] = i;
		}

		for (int i = 1; i < 15; i++) {

			for (int j = 2; j < 15; j++) {
				aptAddress[i][j] = aptAddress[i][j - 1] + aptAddress[i - 1][j];
			}
		}

		int T = Integer.parseInt(bufferReader.readLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(bufferReader.readLine());
			int k = Integer.parseInt(bufferReader.readLine());
			stringBuilder.append(aptAddress[n][k]).append('\n');
		}
		System.out.println(stringBuilder);
	}

}
