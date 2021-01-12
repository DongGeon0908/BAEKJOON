import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cnp = scan.nextLine();
		int n = Integer.parseInt(cnp);

		for (int i = 0; i < n; i++) {
			String tmp = scan.nextLine();
			String[] data = tmp.split(" ");
			int result = 0;
			for (int j = 0; j < data.length; j++) {
				result = result + Integer.parseInt(data[j]);
			}
			System.out.println(result);
		}
	}

}
