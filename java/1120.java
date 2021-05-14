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

		String[] data = bf.readLine().split(" ");

		int result = data[0].length();
		for (int i = 0; i < data[1].length() - data[0].length() + 1; i++) {
			int tmp = 0;
			for (int j = 0; j < data[0].length(); j++) {
				if (data[0].charAt(j) != data[1].charAt(i + j)) {
					tmp++;
				}
			}

			if (result > tmp) {
				result = tmp;
			}
		}

		bw.write(Integer.toString(result));

		bw.flush();
		bw.close();
		bf.close();
	}
}
