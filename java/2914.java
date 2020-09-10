import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

	public static void main(String args[]) throws IOException {
		BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = bufferReader.readLine().split(" ");
		int A = Integer.parseInt(data[0]);
		int I = Integer.parseInt(data[1]);
		bufferWriter.write(String.valueOf(A * (I - 1) + 1));
		bufferWriter.flush();
	}
}
