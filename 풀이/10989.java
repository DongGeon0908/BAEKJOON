import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferReader.readLine());
		int[] input = new int[10001];
		for (int i = 0; i < n; i++) {
			input[Integer.parseInt(bufferReader.readLine())]++;
		}

		BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i < 10001; i++) {
			while (0 < input[i]--) {
				bufferWriter.write(Integer.toString(i) + "\n");
			}
		}
		bufferReader.close();
		bufferWriter.close();
	}
}
