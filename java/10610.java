import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] data = br.readLine().toCharArray();
		int sum = 0;

		Arrays.sort(data);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			sum += (int) (data[i] - '0');
			sb.append(data[i]);

		}

		if (data[0] == '0' && sum % 3 == 0) {
			bw.write(sb.reverse().toString());
		} else {
			bw.write("-1");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
