import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		String[] data = new String[N];

		for (int i = 0; i < N; i++) {
			data[i] = scan.next();
		}

		boolean tmp = false;

		for (int i = 0; i < data[0].length(); i++) {
			tmp = false;
			for (int j = 0; j < N - 1; j++) {

				if (data[j].charAt(i) != data[j + 1].charAt(i)) {
					tmp = true;
					break;
				}

			}

			if (tmp)
				System.out.print("?");
			else
				System.out.print(data[0].charAt(i));

		}

	}

}
