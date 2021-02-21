import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] tmp = scan.nextLine().split(" ");
		String AB = tmp[0] + tmp[1];
		String CD = tmp[2] + tmp[3];

		System.out.println(Long.parseLong(AB) + Long.parseLong(CD));
	}
}
