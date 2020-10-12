import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = scan.nextLine();

		String result = "";
		for (int i = 0; i < word.length(); i++) {

			int tmp = (int) (word.charAt(i));
			if (tmp >= 97) {
				result = result + (char) (tmp - 32);
			} else {
				result = result + (char) (tmp + 32);
			}
		}

		System.out.print(result);
	}

}
