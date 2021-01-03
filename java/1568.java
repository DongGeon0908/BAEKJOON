import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int tmp = 1;
		int result = 0;

		while (N >= 1) {
			if (N < tmp) {
				tmp = 1;
			}
			N = N - tmp;
			tmp = tmp + 1;
			result = result + 1;
		}

		System.out.println(result);
	}
}
