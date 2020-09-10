import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		String Operator = scan.nextLine();
		String B = scan.nextLine();

		if (Operator.equals("+")) {
			String result = "";
			if (A.length() == B.length()) {
				result = "2";
				for (int i = 0; i < B.length() - 1; i++) {
					result = result + "0";
				}
			} else {
				if (A.length() > B.length()) {
					result = A.substring(0, A.length() - B.length()) + B;
				} else {
					result = B.substring(0, B.length() - A.length()) + A;
				}
			}
			System.out.print(result);
		} else {
			if (B.length() != 1) {
				for (int i = 0; i < B.length() - 1; i++) {
					A = A + "0";
				}
			}
			System.out.print(A);
		}
	}
}
