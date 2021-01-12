import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String tmp = scan.nextLine();
		String[] data = tmp.split(" ");

		int result = 0;
		for (int i = 0; i < data.length; i++) {
			result = result + Integer.parseInt(data[i]);
		}
		System.out.println(result);
	}

}
