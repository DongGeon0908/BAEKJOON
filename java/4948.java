import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] tmp = new boolean[246913];

		tmp[0] = true;
		tmp[1] = true;

		for (int i = 2; i <= Math.sqrt(tmp.length); i++) {
			if (tmp[i] == true) {
				continue;
			}
			for (int j = i * i; j < tmp.length; j = j + i) {
				tmp[j] = true;
			}
		}

		while (true) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			int result = 0;

			for (int i = n + 1; i <= 2 * n; i++) {
				if (tmp[i] == false) {
					result = result + 1;
				}
			}
			System.out.println(result);
		}

	}
}
