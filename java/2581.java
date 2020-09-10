import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(buffer.readLine());
		int N = Integer.parseInt(buffer.readLine());

		ArrayList<Integer> data = new ArrayList<Integer>();

		int result = 0;
		for (int i = M; i <= N; i++) {
			int tmp = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					tmp = tmp + 1;
				}
				if (tmp > 2) {
					break;
				}
			}

			if (tmp == 2) {
				result = result + i;
				data.add(i);
			}
		}
		if (data.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(result);
			System.out.println(data.get(0));
		}
	}
}
