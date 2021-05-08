import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		// 0. 조건
		int mod = 1234567891;
		long R = 1;

		// 1. 입력받기
		int L = Integer.parseInt(bf.readLine());
		char[] data = bf.readLine().toCharArray();

		// 2. 결과를 담을 그릇
		long result = 0;

		// 3. 해시연산 진행
		for (int i = 0; i < L; i++) {
			result = (result + (data[i] - 'a' + 1) * R) % mod;
			R = (R * 31) % mod;
		}

		bw.write(Long.toString(result));
		bw.flush();
		bw.close();
		bf.close();
	}
}
