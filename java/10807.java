import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[] data = new int[count];
		for (int i = 0; i < count; i++) {
			data[i] = scan.nextInt();
		}

		int find = scan.nextInt();

		int result = 0;
		for (int j = 0; j < count; j++) {
			if (data[j] == find) {
				result = result + 1;
			}
		}

		System.out.print(result);

	}
}
