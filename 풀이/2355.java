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

		long A = Integer.parseInt(tmp[0]);
		long B = Integer.parseInt(tmp[1]);

		if (A >= B) {
			long cnp = B;
			B = A;
			A = cnp;
		}

		if (B - A == 0) {
			System.out.print(A);
		} else if (B - A == 1) {
			System.out.print(A + B);
		} else {
			long result = ((B * (B - 1) / 2) - (A * (A - 1) / 2)) + B;
			System.out.print(result);
		}
	}
}
