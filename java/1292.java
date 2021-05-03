import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		ArrayList<Integer> data = new ArrayList<Integer>();

		int j = 1;
		int check = 0;
		int result = 0;
		for (int i = 1; i <= B; i++) {
			if (j == check) {
				check = 1;
				j++;
				data.add(j);
			} else {
				check++;
				data.add(j);
			}

			if (i >= A) {
				result += j;
			}
		}

		System.out.println(result);

	}
}
