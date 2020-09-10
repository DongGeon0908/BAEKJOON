import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		int num_16 = Integer.parseInt(num,16);
		System.out.print(num_16);
	}
}
