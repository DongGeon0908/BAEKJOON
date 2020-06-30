import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();

		String[] resultString = num.split(" ");
		int[] resultInt = new int[resultString.length];

		for (int i = 0; i < resultString.length; i++) {
			resultInt[i] = Integer.parseInt(resultString[i]);
		}

		int tmp;
		for (int i = 0; i < resultString.length; i++) {
			for (int j = 0; j < resultString.length - i - 1; j++) {
				if (resultInt[j] > resultInt[j + 1]) {
					tmp = resultInt[j];
					resultInt[j] = resultInt[j + 1];
					resultInt[j + 1] = tmp;
				}
			}
		}

		System.out.println(resultInt[1]);

	}
}
