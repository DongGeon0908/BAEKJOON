import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		int[] locate = new int[T];
		String[] data = new String[T];
		for (int i = 0; i < T; i++) {
			locate[i] = scan.nextInt();
			data[i] = scan.nextLine();
		}

		for (int i = 0; i < T; i++) {
			String result = data[i].replace(" ", "");
			result = result.substring(0, locate[i] - 1) + result.substring(locate[i], result.length());
			System.out.println(result);
		}

	}
}
