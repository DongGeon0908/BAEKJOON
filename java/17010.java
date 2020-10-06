import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();

		String[] result = new String[Integer.parseInt(T)];

		for (int i = 0; i < Integer.parseInt(T); i++) {
			String[] tmp = (scan.nextLine()).split(" ");

			for (int j = 0; j < Integer.parseInt(tmp[0]); j++) {
				result[i] = result[i] + tmp[1];
			}
		}

		for (String i : result) {
			i = i.replace("null", "");
			System.out.println(i);
		}

	}

}
