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

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] data = br.readLine().split(" ");

			long result = 0;

			if (data[1].equals("*")) {
				result = Long.parseLong(data[0]) * Long.parseLong(data[2]);
			} else if (data[1].equals("/")) {
				result = Long.parseLong(data[0]) / Long.parseLong(data[2]);
			} else if (data[1].equals("+")) {
				result = Long.parseLong(data[0]) + Long.parseLong(data[2]);
			} else if (data[1].equals("%")) {
				result = Long.parseLong(data[0]) % Long.parseLong(data[2]);
			} else {
				result = Long.parseLong(data[0]) - Long.parseLong(data[2]);
			}

			if (result == Long.parseLong(data[4])) {
				bw.write("correct");
			} else {
				bw.write("wrong answer");
			}

			bw.write("\n");

		}

		bw.flush();
		bw.close();
		br.close();
	}
}
