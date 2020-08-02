import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine().trim();
		int tmp = 0;
		int[] result = new int[26];
		for (int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		for (int i = 0; i < data.length(); i++) {
			char word = data.charAt(i);
			tmp = (int) word;

			if (result[tmp - 97] == -1) {
				result[tmp - 97] = i;
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
