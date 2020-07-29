import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		String[] num = data.split(",");

		int result = 0;
		for (int i = 0; i < num.length; i++) {
			result = result + Integer.parseInt(num[i]);
		}
		System.out.print(result);

	}
}
