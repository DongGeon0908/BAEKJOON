import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 0;
		long b = 1;
		long c = 0;

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		if (cnt == 1) {
			System.out.println(cnt);
		} else {
			for (int i = 1; i < cnt; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}
	}

}
