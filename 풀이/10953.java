import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String count_S = scan.nextLine();
		int count = Integer.parseInt(count_S);

		String[] data_S = new String[count];
		for (int i = 0; i < count; i++) {
			data_S[i] = scan.nextLine();
		}

		for (int i = 0; i < count; i++) {
			String[] value = data_S[i].split(",");
			System.out.println(Integer.parseInt(value[0]) + Integer.parseInt(value[1]));
		}

	}
}
