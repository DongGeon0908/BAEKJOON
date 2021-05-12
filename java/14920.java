import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int check = 1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bf.readLine());

		System.out.println(C(n));

		bw.flush();
		bw.close();
		bf.close();
	}

	public static int C(int n) {
		if (n == 1) {
			return check;
		}

		int tmp = 0;
		if (n % 2 == 0) {
			tmp = n / 2;
		} else {
			tmp = 3 * n + 1;
		}
		check++;
		return C(tmp);
	}
}
