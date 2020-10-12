import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean[] data = new boolean[2000001];

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			data[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i] == true) {
				sb.append(i - 1000000);
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
