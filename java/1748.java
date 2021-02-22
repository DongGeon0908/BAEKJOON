import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 1;
		int tmp = 0;
		int length = 10;
		for (int i = 1; i <= n; i++) {
			if (i == length) {
				cnt = cnt + 1;
				length = length * 10;
			}
			tmp = tmp + cnt;
		}
		System.out.println(tmp);
	}
}
