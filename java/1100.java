import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int check = 0;
		for (int i = 0; i < 8; i++) {
			String tmp = scan.nextLine();
			String[] cnp = new String[8];
			for (int j = 0; j < 8; j++) {
				cnp[j] = tmp.substring(j, j + 1);
			}

			if (i % 2 == 0) {
				for (int k = 0; k < 8; k = k + 2) {
					if (cnp[k].equals("F")) {
						check++;
					}
				}
			} else {
				for (int k = 1; k < 8; k = k + 2) {
					if (cnp[k].equals("F")) {
						check++;
					}
				}
			}

		}
		System.out.println(check);
	}

}
