import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		int[] data = new int[26];
		while (N-- > 0) {
			int tmp = scan.nextLine().charAt(0) - 'a';
			data[tmp]++;
		}

		String result = "";
		for (int i = 0; i < data.length; i++) {
			if (data[i] >= 5) {
				result += (char) (i + 'a');
			}
		}

		if (result.equals("")) {
			System.out.println("PREDAJA");
		} else {
			System.out.println(result);
		}

	}

}
