import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();

		String[] individual_num = num.split("\\s");
		int[] result = new int[individual_num.length];

		for (int i = 0; i < individual_num.length; i++) {
			result[i] = Integer.parseInt(individual_num[i]);
		}

		System.out.println((result[0] + result[1]) % result[2]);
		System.out.println(((result[0] % result[2]) + (result[1] % result[2])) % result[2]);
		System.out.println((result[0] * result[1]) % result[2]);
		System.out.println(((result[0] % result[2]) * (result[1] % result[2])) % result[2]);
	}
}
