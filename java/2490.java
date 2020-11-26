import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int b = 0;
		int d = 0;
		String result = "";
		for (int i = 0; i < 3; i++) {
			String[] tmp = (scan.nextLine()).split(" ");
			for (int j = 0; j < 4; j++) {
				if (tmp[j].equals("0")) {
					d = d + 1;
				} else {
					b = b + 1;
				}
			}
			if (b == 4) {
				result = result + "E" + "\n";
			} else if (d == 4) {
				result = result + "D" + "\n";
			} else if (d == 3) {
				result = result + "C" + "\n";
			} else if (d == 2) {
				result = result + "B" + "\n";
			} else {
				result = result + "A" + "\n";
			}
			d = 0;
			b = 0;
		}
		System.out.print(result);
	}
}
