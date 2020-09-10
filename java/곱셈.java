import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		String num2 = scan.nextLine();

		int n1 = Integer.parseInt(num2.substring(2, 3));
		int n2 = Integer.parseInt(num2.substring(1, 2));
		int n3 = Integer.parseInt(num2.substring(0, 1));

		System.out.println(Integer.parseInt(num1) * n1);
		System.out.println(Integer.parseInt(num1) * n2);
		System.out.println(Integer.parseInt(num1) * n3);
		System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));

	}
}
