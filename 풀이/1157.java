import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		char[] alpa = word.toCharArray();

		int[] data = new int[26];

		for (int i = 0; i < alpa.length; i++) {
			int big = 65;
			int small = 97;
			for (int j = 0; j < 26; j++) {
				if ((int) alpa[i] == big) {
					data[j] = data[j] + 1;
					break;
				} else {
					big = big + 1;
				}
			}

			for (int j = 0; j < 26; j++) {
				if ((int) alpa[i] == small) {
					data[j] = data[j] + 1;
					break;
				} else {
					small = small + 1;
				}
			}

			big = 65;
			small = 97;

		}

		int tmp = 0;
		int cnp = 0;
		int result = 0;
		for (int i = 0; i < 26; i++) {

			if (tmp < data[i]) {
				tmp = data[i];
				result = i;
			} else if (tmp == data[i]) {
				cnp = data[i];
			}

		}

		if (cnp == tmp) {
			System.out.print("?");
		} else {
			result = result + 65;
			System.out.print((char) result);
		}

	}

}
