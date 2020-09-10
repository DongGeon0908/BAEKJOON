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

		for (int i = 0; i < num; i++) {
			Token = new StringTokenizer(bufferR.readLine());
			int num1 = Integer.parseInt(Token.nextToken());
			int num2 = Integer.parseInt(Token.nextToken());
			int result = num1 + num2;

			bufferW.write(result + "\n");
		}
		bufferW.flush();
	}
}
