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

		if (resultInt[0] > resultInt[1]) {
			System.out.print(">");
		} else if (resultInt[0] < resultInt[1]) {
			System.out.print("<");
		} else {
			System.out.print("==");
		}

	}
}
