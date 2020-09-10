import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int[] add = new int[count];
		for (int i = 0; i < count; i++) {
			add[i] = scan.nextInt();
		}

		int tmp = 0;
		for (int j = 0; j < count; j++) {
			for (int k = 0; k < count; k++) {
				if (add[j] < add[k]) {
					tmp = add[k];
					add[k] = add[j];
					add[j] = tmp;
				}
			}
		}

		for (int num : add) {
			System.out.println(num);
		}
	}
}
