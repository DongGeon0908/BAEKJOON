import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String binary = bf.readLine();
		if (binary.length() % 3 != 0) {
			// 몇개를 더 추가해야 하는가?
			int length = 3 - binary.length() % 3;

			for (int i = 0; i < length; i++) {
				binary = "0" + binary;
			}
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < binary.length(); i = i + 3) {
			sb.append(String.valueOf(Integer.parseInt(binary.substring(i, i + 3), 2)));
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();
		bf.close();
	}
}

// 2진수 3자리 -> 8진수 1자리
