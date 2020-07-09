import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean[] check = new boolean[m + 1];
		check[0] = check[1] = true;
		for (int i = 2; i <= m; i++) {
			if (check[i] == true) {
				continue;
			}
			for (int j = i + i; j <= m; j = j + i) {
				check[j] = true;
			}
		}
		for (int i = n; i <= m; i++) {
			if (check[i] == false) {
				System.out.println(i);
			}
		}
	}

}
