import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		if (N != 1) {
			int result = 0;
			for (int i = 1; i <= N; i++) {
				String tmp = Integer.toString(i);
				String[] cnp = tmp.split("");

				int[] data = new int[tmp.length()];
				result = 0;
				for (int j = 0; j < cnp.length; j++) {
					data[j] = Integer.parseInt(cnp[j]);
					result = result + data[j];
				}
				result = result + i;
				if (result == N) {
					System.out.print(i);
					break;
				} else {
					result = 0;
				}
			}
			if(result == 0) {
				System.out.print(0);
			}
		} else {
			System.out.print(0);
		}
	}
}
