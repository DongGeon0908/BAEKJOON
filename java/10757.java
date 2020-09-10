import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		String[] data = tmp.split(" ");

		System.out.print(new BigInteger(data[0]).add(new BigInteger(data[1])));
	}
}
