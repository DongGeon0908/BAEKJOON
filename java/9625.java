import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		int K = Integer.parseInt(bf.readLine());

		int A = 1;
		int B = 0;

		while (K-- > 0) {
			int tmp = A + B;
			A = B;
			B = tmp;
		}

		bw.write(A + " " + B);

		bw.flush();
		bw.close();
		bf.close();
	}
}
