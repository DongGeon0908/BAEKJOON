import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int[][] data = new int[9][9];
		int tmp = 0;
		int datai = 0;
		int dataj = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				data[i][j] = scan.nextInt();
				if (i == 0 & j == 0) {
					tmp = data[i][j];
				} else {
					if (data[i][j] >= tmp) {
						tmp = data[i][j];
						datai = i;
						dataj = j;
					}
				}
			}
		}
		System.out.println(tmp);
		System.out.println((datai + 1) + " " + (dataj + 1));
	}
}
