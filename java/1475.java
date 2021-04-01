import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] data = scan.nextLine().split("");

		int[] tmp = new int[10];

		for (int i = 0; i < data.length; i++) {
			tmp[Integer.parseInt(data[i])] = tmp[Integer.parseInt(data[i])] + 1;
		}

		if ((tmp[6] + tmp[9]) % 2 == 0) {
			tmp[6] = (tmp[6] + tmp[9]) / 2;
			tmp[9] = 0;
		} else {
			tmp[6] = (tmp[6] + tmp[9]) / 2 + 1;
			tmp[9] = 0;
		}

		Arrays.sort(tmp);
		System.out.println(tmp[9]);

	}
}
