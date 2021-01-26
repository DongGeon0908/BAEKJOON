import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String result = "";
		for (int i = 0; i < 5; i++) {
			String tmp = bf.readLine();
			if (tmp.contains("FBI")) {
				result = result + (i + 1) + " ";
			}
		}

		if (result.length() != 0) {
			bw.write(result);
			bw.close();
		} else {
			bw.write("HE GOT AWAY!");
			bw.close();
		}
	}
}
