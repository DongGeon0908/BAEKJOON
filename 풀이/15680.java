import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

	public static void main(String args[]) throws IOException {
		BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		String N = bufferReader.readLine();

		String result = "";
		if (N.equals("0")) {
			result = "YONSEI";

		} else {
			result = "Leading the Way to the Future";
		}

		bufferWriter.write(result);
		bufferWriter.flush();
	}
}
