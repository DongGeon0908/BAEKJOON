import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();

		int A = time / 300;
		int B = (time - A * 300) / 60;
		int C = (time - A * 300 - B * 60) / 10;

		if ((time - A * 300 - B * 60) % 10 != 0) {
			System.out.print(-1);
		} else {
			System.out.print(A + " " + B + " " + C);
		}
	}
}
