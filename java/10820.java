import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			String tmp = scan.nextLine();
			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) == ' ') {
					d = d + 1;
					;
				} else if ('a' <= tmp.charAt(i) && 'z' >= tmp.charAt(i))
					a = a + 1;
				else if ('A' <= tmp.charAt(i) && 'Z' >= tmp.charAt(i)) {
					b = b + 1;
				} else if (0 <= (int) tmp.charAt(i) - 48 && 9 >= (int) tmp.charAt(i) - 48) {
					c = c + 1;
				}
			}
			System.out.println(a + " " + b + " " + c + " " + d);
		}
		scan.close();
	}

}
