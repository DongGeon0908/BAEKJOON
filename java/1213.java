import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] data = bf.readLine().toCharArray();

		int[] alpha = new int[26];

		// 배열에 삽입을 한다.
		for (int i = 0; i < data.length; i++) {
			alpha[data[i] - 'A']++;
		}

		// 홀수개가 2개 이상이면 펠린드롬 불가능!!
		int check = 0;
		for (int i = 0; i < alpha.length; i++) {
			if (check >= 2) {
				break;
			}
			if (alpha[i] % 2 != 0) {
				check++;
			}
		}

		if (check >= 2) {
			bw.write("I'm Sorry Hansoo");
		} else {
			StringBuffer sb1 = new StringBuffer();

			int tmp = 27;
			for (int i = 0; i < alpha.length; i++) {
				if (alpha[i] != 0) {
					if (alpha[i] % 2 == 0) {
						for (int j = 0; j < alpha[i] / 2; j++) {
							sb1.append((char) (i + 'A'));
						}
						alpha[i] /= 2;
					} else {
						if (alpha[i] != 1) {
							for (int j = 0; j < alpha[i] / 2; j++) {
								sb1.append((char) (i + 'A'));
							}
							alpha[i] = 1;
						}
						tmp = i;
					}
				}
			}

			char[] cnp = sb1.toString().toCharArray();
			Arrays.sort(cnp);

			for (int i = 0; i < cnp.length; i++) {
				bw.write(cnp[i]);
			}

			if (tmp != 27) {
				bw.write((char) (tmp + 'A'));
			}
			for (int i = cnp.length - 1; i >= 0; i--) {
				bw.write(cnp[i]);
			}
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
