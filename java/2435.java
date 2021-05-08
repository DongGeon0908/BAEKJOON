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

		// 1. 데이터를 입력받음
		String[] conditions = bf.readLine().split(" ");
		String[] data = bf.readLine().split(" ");

		// 2. 데이터를 담을 그릇
		ArrayList<Integer> tmp = new ArrayList<Integer>();

		// 3. data 배열에서 연속적인 K일에 대한 데이터 뽑아내기
		int max = 0;
		for (int i = 0; i < Integer.parseInt(conditions[0]); i++) {
			if (i + Integer.parseInt(conditions[1]) > Integer.parseInt(conditions[0])) {
				break;
			} else {
				int cnp = 0;
				for (int j = i; j < i + Integer.parseInt(conditions[1]); j++) {
					cnp += Integer.parseInt(data[j]);
				}

				if (i == 0) {
					max = cnp;
				} else if (cnp >= max) {
					max = cnp;
				}
			}
		}
		// 5. 가장 큰값이 합이 최대가 되는 값
		bw.write(Integer.toString(max));

		bw.flush();
		bw.close();
		bf.close();
	}
}
