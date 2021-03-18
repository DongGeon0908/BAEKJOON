import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int result = 0;
		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();

			int tmp = 0;
			if (a == b && b == c) {
				tmp = 10000 + a * 1000;
			} else if (a != b && b != c && c != a) {
				if (a > b) {
					if (a > c) {
						tmp = a * 100;
					} else {
						tmp = c * 100;
					}
				} else if (b >= a) {
					if (b > c) {
						tmp = b * 100;
					} else {
						tmp = c * 100;
					}

				}
			} else if (a == b) {
				tmp = 1000 + a * 100;
			} else if (b == c) {
				tmp = 1000 + b * 100;
			} else if (c == a) {
				tmp = 1000 + a * 100;
			}

			if (tmp >= result) {
				result = tmp;
			}
		}
		System.out.println(result);
	}
}
