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

		while (true) {
			String str = bf.readLine();
			if (str.equals("***")) {
				break;
			} else {
				StringBuffer sb = new StringBuffer(str);
				String reverseStr = sb.reverse().toString();
				bw.write(reverseStr + "\n");
			}
		}

		bw.flush();
		bw.close();
		bf.close();

	}
}
