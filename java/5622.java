import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

	public static void main(String args[]) throws IOException {
		BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		String data = bufferReader.readLine();
		bufferReader.close();
		int result = 0;

		for (int i = 0; i < data.length(); i++) {
			byte value = (byte) data.charAt(i);
			if (65 <= value && 67 >= value) {
				result = result + 3;
			} else if (68 <= value && 70 >= value) {
				result = result + 4;
			} else if (71 <= value && 73 >= value) {
				result = result + 5;
			} else if (74 <= value && 76 >= value) {
				result = result + 6;
			} else if (77 <= value && 79 >= value) {
				result = result + 7;
			} else if (80 <= value && 83 >= value) {
				result = result + 8;
			} else if (84 <= value && 86 >= value) {
				result = result + 9;
			} else if (87 <= value && 90 >= value) {
				result = result + 10;
			}
		}

		bufferWriter.write(Integer.toString(result));
		bufferWriter.flush();
	}
}
