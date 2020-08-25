import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

	public static void main(String args[]) throws IOException {
		BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bufferReader.readLine().split("-");

		String result = "";

		for (int i = 0; i < data.length; i++) {
			result = result + data[i].substring(0, 1);
		}

		bufferWriter.write(result);
		bufferWriter.flush();
	}
}
