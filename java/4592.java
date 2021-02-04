import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int tmp = scan.nextInt();
			if (tmp == 0) {
				break;
			}
			String result = "";
			int before = 0;
			for (int i = 0; i < tmp; i++) {
				int cnp = scan.nextInt();
				if (i == 0) {
					before = cnp;
					result = cnp + " ";
				} else {
					if (cnp != before) {
						before = cnp;
						result = result + cnp + " ";
					}
				}
			}
			System.out.println(result + "$");
		}
		scan.close();
	}
}
