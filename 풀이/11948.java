
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int[] tmp = new int[4];
		for (int i = 0; i < 4; i++) {
			tmp[i] = scan.nextInt();
		}

		int[] cnp = new int[2];
		for (int i = 0; i < 2; i++) {
			cnp[i] = scan.nextInt();
		}

		Arrays.sort(tmp);
		Arrays.sort(cnp);

		int result = tmp[1] + tmp[2] + tmp[3] + cnp[1];

		System.out.print(result);

	}
}
