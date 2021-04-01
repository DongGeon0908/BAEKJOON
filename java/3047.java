import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[3];

		for (int i = 0; i < 3; i++) {
			data[i] = scan.nextInt();
		}
		scan.nextLine();
		String[] tmp = scan.nextLine().split("");

		Arrays.sort(data);

		for (int i = 0; i < 3; i++) {
			if (tmp[i].equals("A")) {
				System.out.print(data[0] + " ");
			} else if (tmp[i].equals("B")) {
				System.out.print(data[1] + " ");
			} else {
				System.out.print(data[2] + " ");
			}
		}

	}
}
