import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		Deque queue = new LinkedList();
		String[] command = new String[n];
		for (int i = 0; i < n; i++) {
			command[i] = br.readLine();
		}

		for (int i = 0; i < n; i++) {
			if (command[i].contains("push")) {
				String[] tmp = command[i].split(" ");
				queue.add(tmp[1]);
			} else if (command[i].equals("pop")) {
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.pollFirst());
				}
			} else if (command[i].equals("size")) {
				System.out.println(queue.size());
			} else if (command[i].equals("empty")) {
				if (queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command[i].equals("front")) {
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peek());
				}
			} else if (command[i].equals("back")) {
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peekLast());
				}
			}
		}

	}

}
