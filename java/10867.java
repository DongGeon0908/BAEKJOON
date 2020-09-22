import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		TreeSet<Integer> input = new TreeSet<Integer>();

		for (int i = 0; i < N; i++) {
			int tmp = scan.nextInt();
			input.add(tmp);
		}
		
		for(int i : input) {
			System.out.print(i + " ");
		}

	}
}
