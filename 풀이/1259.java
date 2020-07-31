import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();
		while (true) {
			String tmp = scan.nextLine();
			if (tmp.equals("0") != true) {
				data.add(tmp);
			} else {
				break;
			}
		}
		for (int i = 0; i < data.size(); i++) {
			String[] tmp = (data.get(i)).split("");
			String result = "";
			for (int j = (tmp.length - 1); j >= 0; j--) {
				result = result + tmp[j];
			}
			if (result.equals(data.get(i)) == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
