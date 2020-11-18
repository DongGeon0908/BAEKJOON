import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();

		String[] cnp = tmp.split("");

		int check = 0;
		for (int i = 0; i < cnp.length; i++) {
			if (cnp[i].equals("a")) {
				check = check + 1;
			} else if (cnp[i].equals("e")) {
				check = check + 1;
			} else if (cnp[i].equals("i")) {
				check = check + 1;
			} else if (cnp[i].equals("o")) {
				check = check + 1;
			} else if (cnp[i].equals("u")) {
				check = check + 1;
			} else {
				continue;
			}

		}
		System.out.print(check);
	}

}
