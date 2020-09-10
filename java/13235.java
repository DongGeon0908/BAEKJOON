import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();
		String tmp = scan.nextLine();
		data.add(tmp);
		for (int i = 0; i < data.size(); i++) {
			String[] cmp = (data.get(i)).split("");
			String result = "";
			for (int j = (cmp.length - 1); j >= 0; j--) {
				result = result + cmp[j];
			}
			if (result.equals(data.get(i)) == true) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}
}
