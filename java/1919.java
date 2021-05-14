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

		String A = bf.readLine();
		String B = bf.readLine();

		int[] data = new int[26];
		for (int i = 0; i < A.length(); i++) {
			data[A.charAt(i) - 'a']++;
		}

		for (int i = 0; i < B.length(); i++) {
			data[B.charAt(i) - 'a']--;
		}

		int answer = 0;

		for (int i : data) {
			answer += Math.abs(i);
		}

		bw.write(Integer.toString(answer));

		bw.flush();
		bw.close();
		bf.close();
	}
}
