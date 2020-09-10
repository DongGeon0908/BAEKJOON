import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int allPrice = scan.nextInt();
		int[] price = new int[9];

		int result = 0;
		for (int i = 0; i < 9; i++) {
			price[i] = scan.nextInt();
			result = result + price[i];
		}
		System.out.print(allPrice - result);

	}
}
