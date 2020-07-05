import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer Token;
		int num = Integer.parseInt(bufferR.readLine());

		for (int i = 1; i <= num; i++) {
			for (int k = 0; k < num - i; k++) {
				bufferW.write(" ");
			}
			for (int j = 0; j < i; j++) {
				bufferW.write("*");
			}
			bufferW.write("\n");
		}
		bufferW.flush();
	}
}
