import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();

		int N = 64;

		int result = 0;
		while (X > 0) {
			if (N > X) {
				N /= 2;
			} else {
				X -= N;
				result++;
			}
		}
		System.out.println(result);
	}

}
