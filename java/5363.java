import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		while (N-- > 0) {
			String[] tmp = (scan.nextLine()).split(" ");

			for (int i = 2; i < tmp.length; i++) {
				System.out.print(tmp[i] + " ");
			}

			for (int i = 0; i < 2; i++) {
				System.out.print(tmp[i] + " ");
			}
			System.out.println();
		}
	}
}
