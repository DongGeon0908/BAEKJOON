import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = Integer.parseInt(scan.nextLine());

		while (T-- > 0) {

			HashMap<String, Integer> hashmap = new HashMap<>();

			int N = Integer.parseInt(scan.nextLine());

			while (N-- > 0) {

				String[] tmp = scan.nextLine().split(" ");

				if (hashmap.containsKey(tmp[1])) {
					hashmap.put(tmp[1], hashmap.get(tmp[1]) + 1);
				} else {
					hashmap.put(tmp[1], 1);
				}
			}

			int result = 1;

			for (int cnp : hashmap.values()) {
				result = result * (cnp + 1);
			}

			System.out.println(result - 1);

		}
	}
}
