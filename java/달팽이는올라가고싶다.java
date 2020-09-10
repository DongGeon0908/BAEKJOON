import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String content = scan.nextLine();

		String[] num_string = content.split("\\s");
		int[] num_int = new int[num_string.length];
		for (int i = 0; i < num_string.length; i++) {
			num_int[i] = Integer.parseInt(num_string[i]);
		}

		int q1 = num_int[2] - num_int[1];
		int q2 = num_int[0] - num_int[1];

		if (q1 % q2 == 0) {
			System.out.println(q1 / q2);
		} else {
			System.out.println((q1 / q2) + 1);
		}
	}
}
