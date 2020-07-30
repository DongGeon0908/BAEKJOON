import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		String[] data = word.split("");
		for (int i = 0; i < data.length; i++) {
			String tmp = "";
			for (int j = i; j < data.length; j++) {
				tmp = tmp + data[j];
			}
			data[i] = tmp;
		}
		Arrays.sort(data, 0, data.length);
		for (String a : data) {
			System.out.println(a);
		}
	}
}
