import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> data = new PriorityQueue<Integer>(Collections.reverseOrder());
		while (N-- > 0) {
			int input = Integer.parseInt(br.readLine());

			if (input == 0) {
				if (data.size() == 0) {
					bw.write("0\n");
				} else {
					bw.write(String.valueOf(data.poll()) + "\n");
				}
			}
			data.add(input);

		}

		bw.flush();
		bw.close();
		br.close();
	}

}
