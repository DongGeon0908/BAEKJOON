import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int k = scan.nextInt();

			int result = n;
			while (n / k != 0) {
				result = result + n / k;
				n = n / k + n % k;
			}

			System.out.println(result);
		}

	}
}

/*
 * 나머지 값에 대해 생각을 하지 못함....
 * 
 */
