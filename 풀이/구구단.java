import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}

	}
}
