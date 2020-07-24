import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>();

		for (int i = 0; i < count; i++) {
			data.add(scan.nextInt());
		}

		Collections.sort(data);

		int tmp = 0;
		int result = 0;
		for (int i = 0; i < count; i++) {
			tmp = tmp + data.get(i);
			result = result + tmp;
		}
		System.out.println(result);

	}
}
