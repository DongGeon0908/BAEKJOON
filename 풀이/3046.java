import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R1 = scan.nextInt();
		int S = scan.nextInt();
		int R2 = 2*S - R1;
		System.out.print(R2);
	}
}
