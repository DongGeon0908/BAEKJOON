import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[5];
		int result = 0;

		for (int i = 0; i < 5; i++) {
			data[i] = scan.nextInt();
			result = result + data[i];
		}
		System.out.print(result);
	}
}
