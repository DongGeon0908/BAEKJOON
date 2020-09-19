import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> N = new ArrayList<Integer>();

		int plus = 0;
		for (int i = 0; i < 7; i++) {
			int tmp = scan.nextInt();
			if (tmp % 2 != 0) {
				N.add(tmp);
				plus = plus + tmp;
			}
		}

		if (plus == 0) {
			System.out.print(-1);
		} else {
			int tmp = N.get(0);
			for (int i = 1; i < N.size(); i++) {
				if (tmp > N.get(i)) {
					tmp = N.get(i);
				}
			}

			System.out.println(plus);
			System.out.println(tmp);
		}

	}
}
