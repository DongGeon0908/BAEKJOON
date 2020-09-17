import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		ArrayList<Integer> H = new ArrayList<Integer>();
		ArrayList<Integer> W = new ArrayList<Integer>();
		ArrayList<Integer> N = new ArrayList<Integer>();

		for (int i = 0; i < T; i++) {
			H.add(scan.nextInt());
			W.add(scan.nextInt());
			N.add(scan.nextInt());
		}

		for (int i = 0; i < T; i++) {
			int tmp = N.get(i) / H.get(i);
			int cnp = N.get(i) % H.get(i);
			if (cnp > 0) {
				tmp = tmp + 1;
			}
			if (cnp == 0) {
				cnp = H.get(i);
			}
			System.out.print(cnp);
			if (tmp < 10) {
				System.out.print(0);
			}
			System.out.println(tmp);

		}

	}
}
