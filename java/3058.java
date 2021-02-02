import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int result = 0;
			int min = 101;
			for (int j = 0; j < 7; j++) {
				int tmp = scan.nextInt();
				if (tmp % 2 == 0) {
					result = result + tmp;
					if (tmp < min) {
						min = tmp;
					}
				}
			}
			System.out.println(result + " " + min);
		}

	}
}
