import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int N = scan.nextInt();

			BigInteger result = new BigInteger("0");
			while (N-- > 0) {
				long tmp = scan.nextLong();
				BigInteger temp = new BigInteger(Long.toString(tmp));
				result = result.add(temp);
			}
			BigInteger cnp = new BigInteger("0");

			if (result.compareTo(cnp) == 0) {
				System.out.println(0);
			} else if (result.compareTo(cnp) == 1) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
	}
}
