import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int L = scan.nextInt();
		int P = scan.nextInt();

		int tmp = L * P;
		int[] data = new int[5];

		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextInt();
		}
		
		for(int i=0; i < data.length; i++) {
			System.out.print((data[i] - tmp) + " ");
		}
		

	}
}
