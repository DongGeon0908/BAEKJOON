import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int result = 0;

		for (int i = 0; i < 5; i++) {
			score[i] = scan.nextInt();
			if (score[i] < 40) {
				score[i] = 40;
			}
			result = result + score[i];
		}

		System.out.println(result / 5);

	}
}
