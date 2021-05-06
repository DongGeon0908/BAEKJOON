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

		int T = Integer.parseInt(bf.readLine());
		while (T-- > 0) {
			String[] tmp = bf.readLine().split(" ");
			int[] A = new int[26];
			for (int i = 0; i < tmp[0].length(); i++) {
				A[tmp[0].charAt(i) - 'a']++;
			}
			int[] B = new int[26];
			for (int i = 0; i < tmp[1].length(); i++) {
				B[tmp[1].charAt(i) - 'a']++;
			}

			String result = "anagrams.";
			for (int i = 0; i < 26; i++) {
				if (A[i] != B[i]) {
					result = "NOT anagrams.";
					break;
				}
			}
			result = tmp[0] + " & " + tmp[1] + " are " + result;
			bw.write(result + "\n");
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
