import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[6];

		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextInt();
		}

		int result = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i] == data[0]) {
				result++;
			}
		}
		System.out.println(result);
	}
}
