import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int s = scan.nextInt();
		int k = scan.nextInt();
		int h = scan.nextInt();

		if (s + k + h >= 100) {
			System.out.println("OK");
		} else {
			if (s > k && s > h) {
				if (k > h) {
					System.out.print("Hanyang");
				} else {
					System.out.print("Korea");
				}
			} else if (k > s && k > h) {
				if (s > h) {
					System.out.print("Hanyang");
				} else {
					System.out.print("Soongsil");
				}
			} else if (h > s && h > k) {
				if (s > k) {
					System.out.print("Korea");
				} else {
					System.out.print("Soongsil");
				}
			}
		}
	}
}
