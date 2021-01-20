import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		String[] tmp = data.split(" ");

		String[] N = new String[Integer.parseInt(tmp[0])];
		for (int i = 0; i < Integer.parseInt(tmp[0]); i++) {
			N[i] = br.readLine();
		}

		int result = 0;
		for (int i = 0; i < Integer.parseInt(tmp[1]); i++) {
			String M = br.readLine();
			for (int j = 0; j < Integer.parseInt(tmp[0]); j++) {
				if (N[j].equals(M)) {
					result = result + 1;
					break;
				}
			}
		}
		System.out.println(result);

	}
}
