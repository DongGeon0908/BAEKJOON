import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";

		String Nx = scan.nextLine();
		String[] nx = Nx.split("\\s");

		String Content = scan.nextLine();
		String[] content = Content.split("\\s");

		for (int i = 0; i < Integer.parseInt(nx[0]); i++) {
			if (Integer.parseInt(nx[1]) > Integer.parseInt(content[i])) {
				result = result + content[i] + " ";
			}
		}
		System.out.println(result);

	}
}
