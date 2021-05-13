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

		String data = bf.readLine();
		String find = bf.readLine();

		int result = (data.length() - data.replace(find, "").length()) / find.length();

		bw.write(Integer.toString(result));

		bw.flush();
		bw.close();
		bf.close();
	}
}
