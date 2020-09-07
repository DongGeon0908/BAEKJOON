import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int cnt = 1;
		int range = 1;
		int tmp = 1;

		while (true) {
			if (range >= N) {
				break;
			}
			tmp = 6 * (cnt++);
			range += tmp;

		}

		System.out.println(cnt);
	}
}
