import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String tmp = Integer.toBinaryString(n);
		System.out.println(tmp.length());
		
		
	}

}
