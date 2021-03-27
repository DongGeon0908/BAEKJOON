import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		data = data.replace("apa", "a").replace("epe", "e").replace("ipi", "i").replace("opo", "o").replace("upu", "u");

		System.out.println(data);
	}
}
