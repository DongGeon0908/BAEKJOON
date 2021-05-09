import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());
		int D = Integer.parseInt(bf.readLine());
		int E = Integer.parseInt(bf.readLine());

		int T = 0;
		int check = 0;
		while (true) {
			if (A == B) {
				break;
			} else {
				if (A < 0) {
					A++;
					T += C;
				} else if (A == 0 && check == 0) {
					T += D;
					check = 1;
				} else {
					A++;
					T += E;
				}
			}
		}

		bw.write(Integer.toString(T));
		bw.flush();
		bw.close();
		bf.close();
	}
}
