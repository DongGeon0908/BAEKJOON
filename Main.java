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

		// buffer로 읽기
		// bf.readLine();

		// buffer에 들어감
		// bw.write(문자열);

		// 개행
		// bw.newLine();

		bw.flush();
		bw.close();
		bf.close();
	}
}
