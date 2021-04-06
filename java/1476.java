import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int E = scan.nextInt();
		int S = scan.nextInt();
		int M = scan.nextInt();

		int e;
		int s;
		int m;

		e = s = m = 1;

		int result = 1;
		while (true) {
			if (e == E && m == M && s == S) {
				System.out.println(result);
				break;
			}
			e++;
			s++;
			m++;

			if (e == 16) {
				e = 1;
			}

			if (s == 29) {
				s = 1;
			}

			if (m == 20) {
				m = 1;
			}

			result++;

		}

	}
}

/*
 * 해당 코드는 처음부터 끝까지 반복문이 진행된다.
 * 개인적으로 비효율적인 코드라고 생각한다.
 * 수학적 접근 방식이 필요하다
 * */
