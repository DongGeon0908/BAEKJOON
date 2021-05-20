import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = bf.readLine();

		int result = 0;
		int n = 0;
		while (true) {
			if (input.length() == 1) {
				break;
			}

			int cnp = 0;
			char[] data = input.toCharArray();
			for (int i = 0; i < data.length; i++) {
				cnp += (data[i] - '0');
			}
			input = String.valueOf(cnp);
			n = cnp;

			result++;
		}

		bw.write(result + "\n");

		if (result == 0) {
			n = Integer.parseInt(input);
		}

		if (n % 3 == 0) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
