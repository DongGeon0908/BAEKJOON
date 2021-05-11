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

		for (int i = 0; i < 3; i++) {
			char[] data = bf.readLine().toCharArray();
			int max = 0;

			for (int j = 0; j < 8; j++) {
				int count = 0;
				for (int k = j; k < 8; k++) {
					if (data[j] == data[k]) {
						count++;
					} else {
						break;
					}
				}
				if (count > max) {
					max = count;
				}
			}
			bw.write(Integer.toString(max) + "\n");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
