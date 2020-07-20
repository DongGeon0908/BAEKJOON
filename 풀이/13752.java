import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[] data = new int[count];
		for (int i = 0; i < count; i++) {
			data[i] = scan.nextInt();
		}

		for (int j = 0; j < count; j++) {
			for (int k = 0; k < data[j]; k++) {
				System.out.print("=");
			}
			System.out.println();
		}

	}
}
