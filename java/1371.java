import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] alpha = new int[26];

		while (scan.hasNextLine()) {
			String tmp = scan.nextLine();
			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) >= 'a' && tmp.charAt(i) <= 'z') {
					alpha[tmp.charAt(i) - 'a'] = alpha[tmp.charAt(i) - 'a'] + 1;
				}
			}
		}

		int max = 0;
		String result = "";
		for (int i = 0; i < 26; i++) {
			if (max < alpha[i]) {
				max = alpha[i];
				result = Character.toString((char) (i + 'a'));
			} else if (max == alpha[i]) {
				result = result + Character.toString((char) (i + 'a'));
			}
		}

		System.out.println(result);
		scan.close();
	}
}
