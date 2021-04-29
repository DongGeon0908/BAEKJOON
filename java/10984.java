import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine().trim());
		for (int i = 0; i < count; i++) {
			float totalPoint = 0;
			int totalsubject = 0;
			int su = Integer.parseInt(scan.nextLine().trim());
			for (int j = 0; j < su; j++) {
				int subject = scan.nextInt();
				float point = Float.parseFloat(scan.nextLine().trim());
				totalPoint += point * subject;
				totalsubject += subject;
			}
			System.out.println(totalsubject + " " + Math.round(totalPoint / totalsubject * 10) / 10.0);
		}
		scan.close();
	}
}
