import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		String[] tmp = bf.readLine().split(" ");

		int[] data = new int[Integer.parseInt(tmp[1]) + 1];

		for (int i = 1; i <= Integer.parseInt(tmp[1]); i++) {
			String cnp = Integer.toString(Integer.parseInt(tmp[0]) * i);

			StringBuffer sb = new StringBuffer(cnp);
			String reversed = sb.reverse().toString();

			data[i] = Integer.parseInt(reversed);
		}

		Arrays.sort(data);

		bw.write(Integer.toString(data[data.length - 1]));
		bw.flush();
		bw.close();
		bf.close();
	}
}
