import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer Token;

		for (;;) {
			Token = new StringTokenizer(bufferR.readLine());
			int num1 = Integer.parseInt(Token.nextToken());
			int num2 = Integer.parseInt(Token.nextToken());

			if (num1 == 0 && num2 == 0) {
				break;
			}

			int result = num1 + num2;

			bufferW.write(result + "\n");
		}
		bufferW.flush();

	}
}
