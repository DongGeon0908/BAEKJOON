import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());

			if (maxPriorityQueue.size() == minPriorityQueue.size()) {
				maxPriorityQueue.offer(input);
			} else {
				minPriorityQueue.offer(input);
			}

			if (!maxPriorityQueue.isEmpty() && !minPriorityQueue.isEmpty()) {
				if (maxPriorityQueue.peek() > minPriorityQueue.peek()) {
					int maxNum = maxPriorityQueue.poll();
					int minNum = minPriorityQueue.poll();

					maxPriorityQueue.offer(minNum);
					minPriorityQueue.offer(maxNum);
				}
			}

			int midNum = maxPriorityQueue.peek();
			bw.write(String.valueOf(midNum) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
