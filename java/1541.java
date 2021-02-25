import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String data = scan.next();

		String[] str = data.split("-");

		String[] tmp = str[0].split("\\+");
		int first = 0;
		for (String t : tmp)
			first = first + Integer.parseInt(t);

		int last = 0;
		for (int i = 1; i < str.length; i++) {
			String[] cnp = str[i].split("\\+");
			for (String t : cnp) {
				last = last + Integer.parseInt(t);
			}
		}
		System.out.println(first - last);
	}
}
