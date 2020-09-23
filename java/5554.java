import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0;
		for (int i = 0; i < 4; i++) {
			int tmp = scan.nextInt();
			result = result + tmp;
		}
		System.out.println(result / 60);
		System.out.println(result % 60);
	}

}
