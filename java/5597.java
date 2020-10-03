import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		boolean[] data = new boolean[30];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 28; i++) {
			int tmp = scan.nextInt();
			data[tmp-1] = true;
		}

		for (int i = 0; i < 30; i++) {
			if (data[i] != true) {
				System.out.println(i+1);
			}
		}

	}
}
