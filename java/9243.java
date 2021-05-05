import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		int N = Integer.parseInt(bf.readLine());
		String[] in = bf.readLine().split("");
		String[] out = bf.readLine().split("");

		while (N-- > 0) {
			for (int i = 0; i < in.length; i++) {
				if (in[i].equals("0")) {
					in[i] = "1";
				} else {
					in[i] = "0";
				}
			}
		}

		String result = "Deletion succeeded";
		for (int i = 0; i < in.length; i++) {
			if (!in[i].equals(out[i])) {
				result = "Deletion failed";
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();
		bf.close();

	}
}
