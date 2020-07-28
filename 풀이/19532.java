import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[6];
		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextInt();
		}

		int x = ((data[1] * data[5]) - (data[4] * data[2])) / ((data[1] * data[3]) - (data[0] * data[4]));
		int y = ((data[0] * data[5]) - (data[3] * data[2])) / ((data[0] * data[4]) - (data[1] * data[3]));

		System.out.println(x + " " + y);
	}
}
