import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());

		for (int i = 0; i < n; i++) {
			boolean check = true;
			String tmp = br.readLine().trim();
			Stack<String> stack = new Stack<>();
			String[] cnp = tmp.split("");
			for (int j = 0; j < cnp.length; j++) {
				if (cnp[j].equals("(")) {
					stack.push(cnp[j]);
				} else {
					if (!stack.isEmpty()) {
						stack.pop();
					} else {
						check = false;
						break;
					}
				}
			}
			if (stack.isEmpty() && check == true) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}

		}
		br.close();
		bw.flush();
		bw.close();
	}

}
