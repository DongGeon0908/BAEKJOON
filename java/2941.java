import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] data = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < data.length; i++) {
			input = input.replace(data[i], "&");
		}
		System.out.print(input.length());
	}
}
