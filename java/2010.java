import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int check = 1;
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			check = check + tmp - 1;
		}
		sb.append(check);
		System.out.print(sb);
	}

}
