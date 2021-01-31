import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		String[] data = tmp.split(" ");
		String result = "";
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals("bubble") != true && data[i].equals("tapioka") != true) {
				result = result + data[i] + " ";
			}
		}
		if (result.equals("")) {
			System.out.println("nothing");
		} else {
			System.out.println(result);
		}
	}
}
