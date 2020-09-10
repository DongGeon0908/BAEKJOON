import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();

		String[] number = num.split(" ");

		String re_num1 = number[0].substring(2, 3) + number[0].substring(1, 2) + number[0].substring(0, 1);
		String re_num2 = number[1].substring(2, 3) + number[1].substring(1, 2) + number[1].substring(0, 1);

		int num1_INT = Integer.parseInt(re_num1);
		int num2_INT = Integer.parseInt(re_num2);

		if (num1_INT > num2_INT) {
			System.out.print(num1_INT);
		} else {
			System.out.print(num2_INT);
		}

	}
}
