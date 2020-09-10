import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();

		int i = 0;
		while (true) {
			data.add(scan.nextLine());
			if (data.get(i).equals("0 0")) {
				break;
			}
			i++;
		}

		for (int j = 0; j < (data.size() - 1); j++) {
			String[] tmp = (data.get(j)).split(" ");
			int[] count = new int[2];
			count[0] = Integer.parseInt(tmp[0]);
			count[1] = Integer.parseInt(tmp[1]);
			if ((count[1] >= count[0]) && ((count[1] % count[0]) == 0)) {
				System.out.println("factor");
			} else if ((count[0] >= count[1]) && ((count[0] % count[1]) == 0)) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}

	}
}
