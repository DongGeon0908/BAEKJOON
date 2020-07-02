import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String content = scan.nextLine();
		String[] result;

		if (content.length() == 0) {
			result = new String[content.length() / 10];
		} else {
			result = new String[(content.length() / 10) + 1];
		}

		for (int i = 0; i < result.length; i++) {
			if (content.length() < (i + 1) * 10) {
				result[i] = content.substring(i * 10, content.length());
			} else {
				result[i] = content.substring(i * 10, (i + 1) * 10);
			}
		}

		for (String obj : result) {
			System.out.println(obj);
		}
	}
}
