import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();

		for (int i = 0; i < Integer.parseInt(tmp); i++) {
			int result = 0;
			String cnp = scan.nextLine();
			boolean[] data = new boolean[26];

			for (int j = 0; j < cnp.length(); j++) {
				if (data[cnp.charAt(j) - 65] == false) {
					result = result + cnp.charAt(j);
					data[cnp.charAt(j) - 65] = true;
				}
			}
			System.out.println(2015 - result);
		}
	}
}
