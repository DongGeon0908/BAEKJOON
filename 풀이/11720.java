import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String number = scan.nextLine();
		int result = 0;
		for (int i = 0; i < Integer.parseInt(num); i++) {
			result = result + Integer.parseInt(number.substring(i, i + 1));
		}
		System.out.println(result);

	}

}
