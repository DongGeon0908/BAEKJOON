import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String count = scan.nextLine();

		String[] data = new String[Integer.parseInt(count)];
		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextLine();
		}

		for (int i = 0; i < data.length; i++) {
			String[] tmp = data[i].split("\\s");
			String[] word = tmp[1].split("");
			for (int j = 0; j < tmp[1].length(); j++) {
				for (int k = 0; k < Integer.parseInt(tmp[0]); k++) {
					System.out.print(word[j]);
				}
			}
			System.out.println();
		}

	}
}
