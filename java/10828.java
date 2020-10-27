import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		Stack<Integer> stack = new Stack<>();
		String[] command = new String[n];
		for (int i = 0; i < n; i++) {
			command[i] = br.readLine();
		}

		for (int i = 0; i < n; i++) {
			if (command[i].contains("push")) {
				String[] cnp = command[i].split(" ");
				stack.push(Integer.parseInt(cnp[1]));
			} else if (command[i].equals("top")) {
				if (stack.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(stack.get(stack.size() - 1));
				}
			} else if (command[i].equals("size")) {
				System.out.println(stack.size());
			} else if (command[i].equals("empty")) {
				if (stack.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command[i].equals("pop")) {
				if (stack.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
			}
		}

	}

}
