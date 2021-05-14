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

		String[] data = (bf.readLine().replace(",", "").replace(";", "")).split(" ");

		for (int i = 1; i < data.length; i++) {
			char[] tmp = data[i].toCharArray();
			StringBuffer sb1 = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			for (int j = tmp.length - 1; j >= 0; j--) {
				if ((tmp[j] >= 'a' && tmp[j] <= 'z') || (tmp[j] >= 'A' && tmp[j] <= 'Z')) {
					sb1.append(tmp[j]);
				} else {
					sb2.append(tmp[j]);
				}
			}
			bw.write(data[0] + sb2.toString().replace("][", "[]") + " " + sb1.reverse().toString() + ";\n");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
