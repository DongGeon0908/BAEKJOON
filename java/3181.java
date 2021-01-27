import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		String[] data = tmp.split(" ");
		String[] delete = { "i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili" };

		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				char cnp = (char) ((int) (data[i].charAt(0)) - 32);
				System.out.print(cnp);
			} else {
				String stop = "go";
				for (int j = 0; j < delete.length; j++) {
					if (data[i].equals(delete[j])) {
						stop = "stop";
						break;
					}
				}
				if (stop.equals("stop")) {
					continue;
				} else {
					char cnp = (char) ((int) (data[i].charAt(0)) - 32);
					System.out.print(cnp);
				}
			}
		}
	}
}
