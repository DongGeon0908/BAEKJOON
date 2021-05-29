import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] data = br.readLine().split(" ");
		int[] num = new int[Integer.parseInt(data[0]) + Integer.parseInt(data[1])];

		String[] tmp1 = br.readLine().split(" ");
		for (int i = 0; i < Integer.parseInt(data[0]); i++) {
			num[i] = Integer.parseInt(tmp1[i]);
		}

		String[] tmp2 = br.readLine().split(" ");
		for (int i = Integer.parseInt(data[0]); i < num.length; i++) {
			num[i] = Integer.parseInt(tmp2[i - Integer.parseInt(data[0])]);
		}

		Arrays.sort(num);

		for (int i : num) {
			bw.write(i + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
