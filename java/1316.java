import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] data = new String[Integer.parseInt(N)];

		int result = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextLine();
			if (data[i].length() != 1) {
				String[] tmp = data[i].split("");
				int cnp = 1;
				for (int j = 1; j < data[i].length(); j++) {
					if (tmp[j - 1].equals(tmp[j]) != true) {
						for (int k = 0; k < j; k++) {
							if (tmp[k].equals(tmp[j])) {
								cnp = 0;
								break;
							}
						}
					}

				}
				if (cnp == 1) {
					result = result + 1;
				}
			} else {
				result = result + 1;
			}
		}
		System.out.print(result);
	}
}
