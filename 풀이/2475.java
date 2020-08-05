import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String data = buffer.readLine();

		String[] tmp = data.split(" ");

		long result = 0;
		int[] N = new int[5];
		for (int i = 0; i < 5; i++) {
			N[i] = Integer.parseInt(tmp[i]);
			result = result + N[i] * N[i];
		}

		result = result % 10;
		System.out.print(result);
	}
}
