import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");

		Set<String> data = new HashSet<String>();

		for (int i = 0; i < N; i++) {
			data.add(input1[i]);
		}

		int M = Integer.parseInt(br.readLine());
		String[] input2 = br.readLine().split(" ");

		for (int i = 0; i < M; i++) {
			if (data.contains(input2[i])) {
				bw.write("1 ");
			} else {
				bw.write("0 ");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
