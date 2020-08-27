import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		String data = bufferReader.readLine();
		bufferReader.close();
		String[] tmp = data.split(" ");

		int[] result = new int[6];
		result[0] = 1 - Integer.parseInt(tmp[0]);
		result[1] = 1 - Integer.parseInt(tmp[1]);
		result[2] = 2 - Integer.parseInt(tmp[2]);
		result[3] = 2 - Integer.parseInt(tmp[3]);
		result[4] = 2 - Integer.parseInt(tmp[4]);
		result[5] = 8 - Integer.parseInt(tmp[5]);

		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
