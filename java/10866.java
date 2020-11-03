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
		Deque deque = new LinkedList();
		String[] command = new String[n];
		for (int i = 0; i < n; i++) {
			command[i] = br.readLine();
		}

		for (int i = 0; i < n; i++) {
			if (command[i].contains("push_front")) {
				String[] tmp = command[i].split(" ");
				deque.addFirst(tmp[1]);
			} else if (command[i].contains("push_back")) {
				String[] tmp = command[i].split(" ");
				deque.addLast(tmp[1]);
			} else if (command[i].equals("pop_front")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollFirst());
				}
			} else if (command[i].equals("pop_back")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollLast());
				}
			} else if (command[i].equals("size")) {
				System.out.println(deque.size());
			} else if (command[i].equals("empty")) {
				if (deque.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (command[i].equals("front")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peek());
				}
			} else if (command[i].equals("back")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekLast());
				}
			}
		}

	}

}
