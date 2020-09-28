import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();

		double result1 = R * R * 3.14159265358979323846;
		double result2 = 2 * R * R;

		System.out.println(String.format("%.6f", result1));
		System.out.println(String.format("%.6f", result2));
	}
}
