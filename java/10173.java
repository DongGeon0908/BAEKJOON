import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String tmp = scan.nextLine();

			if (tmp.contains("EOI")) {
				break;
			}

			if (tmp.contains("nemo")) {
				System.out.println("Found");
			} else if (tmp.contains("Nemo")) {
				System.out.println("Found");
			} else if (tmp.contains("nEmo")) {
				System.out.println("Found");
			} else if (tmp.contains("neMo")) {
				System.out.println("Found");
			} else if (tmp.contains("nemO")) {
				System.out.println("Found");
			} else if (tmp.contains("NEmo")) {
				System.out.println("Found");
			} else if (tmp.contains("nEMo")) {
				System.out.println("Found");
			} else if (tmp.contains("neMO")) {
				System.out.println("Found");
			} else if (tmp.contains("NemO")) {
				System.out.println("Found");
			} else if (tmp.contains("NeMo")) {
				System.out.println("Found");
			} else if (tmp.contains("nEmO")) {
				System.out.println("Found");
			} else if (tmp.contains("NEMo")) {
				System.out.println("Found");
			} else if (tmp.contains("NEmO")) {
				System.out.println("Found");
			} else if (tmp.contains("nEMO")) {
				System.out.println("Found");
			} else if (tmp.contains("NeMO")) {
				System.out.println("Found");
			} else if (tmp.contains("NEMO")) {
				System.out.println("Found");
			} else {
				System.out.println("Missing");
			}
		}
	}
}
