import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		while (T-- > 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = 1;

			// 범위가 너무 커지니까, 해당 문제에서 필요한 첫번째값만 사용
			for (int i = 1; i <= b; i++) {
				n = (n * a) % 10;
			}

			if (n == 0) {
				System.out.println(10);
			} else {
				System.out.println(n);
			}

		}

	}

}
