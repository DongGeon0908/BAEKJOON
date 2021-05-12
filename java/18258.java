import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());
		Deque<String> data = new ArrayDeque();
		while (N-- > 0) {
			String tmp = bf.readLine();

			if (tmp.contains("push")) {
				String[] cnp = tmp.split(" ");
				data.addLast(cnp[1]);
			} else if (tmp.contains("front")) {
				if (data.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(data.getFirst() + "\n");
				}
			} else if (tmp.contains("size")) {
				bw.write(Integer.toString(data.size()) + "\n");
			} else if (tmp.contains("back")) {
				if (data.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(data.getLast() + "\n");
				}
			} else if (tmp.contains("empty")) {
				if (data.size() == 0) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if (tmp.contains("pop")) {
				if (data.size() == 0) {
					bw.write("-1\n");
				} else {
					bw.write(data.removeFirst() + "\n");
				}
			}
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
