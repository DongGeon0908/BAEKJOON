import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		} else if (a + b + c == 180 && (a == b || b == c || c == a)) {
			System.out.println("Isosceles");
		} else if (a + b + c == 180 && a != b && b != c && c != a) {
			System.out.println("Scalene");
		} else if (a + b + c != 180) {
			System.out.println("Error");
		}
	}
}
