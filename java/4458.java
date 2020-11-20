import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean[] data = new boolean[2000001];

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			char first = tmp.charAt(0);
			if ((int) first >= 97) {
				first = (char) ((int) first - 32);
			}
			sb.append(first + tmp.substring(1, tmp.length()));
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
