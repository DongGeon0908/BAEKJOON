import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		while (N-- > 0) {
			String[] tmp = scan.nextLine().split(" ");

			int[] a = new int[26];
			int[] b = new int[26];

			for (int i = 0; i < tmp[0].length(); i++) {
				a[tmp[0].charAt(i) - 'a']++;
			}

			for (int i = 0; i < tmp[1].length(); i++) {
				b[tmp[1].charAt(i) - 'a']++;
			}

			if (tmp[0].length() != tmp[1].length()) {
				System.out.println("Impossible");
			} else {
				boolean check = true;
				for (int i = 0; i < 26; i++) {
					if (a[i] != b[i]) {
						check = false;
						break;
					}
				}

				if (check == true) {
					System.out.println("Possible");
				} else {
					System.out.println("Impossible");
				}
			}
		}
	}
}
