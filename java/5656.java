import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (true) {
			i = i + 1;
			String tmp = scan.nextLine();
			if (tmp.contains("E")) {
				break;
			} else if (tmp.contains(">=")) {
				String[] data = tmp.split(" >= ");
				System.out.println("Case " + i + ": " + (Integer.parseInt(data[0]) >= Integer.parseInt(data[1])));
			} else if (tmp.contains(">")) {
				String[] data = tmp.split(" > ");
				System.out.println("Case " + i + ": " + (Integer.parseInt(data[0]) > Integer.parseInt(data[1])));
			} else if (tmp.contains("<=")) {
				String[] data = tmp.split(" <= ");
				System.out.println("Case " + i + ": " + (Integer.parseInt(data[0]) <= Integer.parseInt(data[1])));
			} else if (tmp.contains("<")) {
				String[] data = tmp.split(" < ");
				System.out.println("Case " + i + ": " + (Integer.parseInt(data[0]) < Integer.parseInt(data[1])));
			} else if (tmp.contains("==")) {
				String[] data = tmp.split(" == ");
				System.out.println("Case " + i + ": " + (Integer.parseInt(data[0]) == Integer.parseInt(data[1])));
			} else if (tmp.contains("!=")) {
				String[] data = tmp.split(" != ");
				System.out.println("Case " + i + ": " + (Integer.parseInt(data[0]) != Integer.parseInt(data[1])));
			}
		}
	}
}
