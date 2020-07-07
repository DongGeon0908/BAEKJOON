import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = num; i > 0; i--) {
			for (int k = 0; k < num - i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
