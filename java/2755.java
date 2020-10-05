import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();

		double plus = 0;
		double result = 0;
		for (int i = 0; i < Integer.parseInt(N); i++) {
			String[] tmp = new String[3];
			tmp = (scan.nextLine()).split(" ");

			double cnp = 0;
			if (tmp[2].equals("A+")) {
				cnp = 4.3;
			} else if (tmp[2].equals("A0")) {
				cnp = 4.0;
			} else if (tmp[2].equals("A-")) {
				cnp = 3.7;
			} else if (tmp[2].equals("B+")) {
				cnp = 3.3;
			} else if (tmp[2].equals("B0")) {
				cnp = 3.0;
			} else if (tmp[2].equals("B-")) {
				cnp = 2.7;
			} else if (tmp[2].equals("C+")) {
				cnp = 2.3;
			} else if (tmp[2].equals("C0")) {
				cnp = 2.0;
			} else if (tmp[2].equals("C-")) {
				cnp = 1.7;
			} else if (tmp[2].equals("D+")) {
				cnp = 1.3;
			} else if (tmp[2].equals("D0")) {
				cnp = 1.0;
			} else if (tmp[2].equals("D-")) {
				cnp = 0.7;
			} else {
				cnp = 0.0;
			}
			plus = plus + Integer.parseInt(tmp[1]);
			result = result + cnp * Integer.parseInt(tmp[1]);
		}

		System.out.print(String.format("%.2f", (result / plus)));
	}

}
