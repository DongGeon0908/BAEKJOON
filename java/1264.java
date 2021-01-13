import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String tmp = scan.nextLine();
			if (tmp.equals("#")) {
				break;
			}

			String[] data = tmp.split("");
			int result = 0;

			for (int i = 0; i < tmp.length(); i++) {
				if (data[i].equals("a")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("e")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("i")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("o")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("u")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("A")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("E")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("I")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("O")) {
					result = result + 1;
					continue;
				} else if (data[i].equals("U")) {
					result = result + 1;
					continue;
				}
			}

			System.out.println(result);
		}

	}

}
