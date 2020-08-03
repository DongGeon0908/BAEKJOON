import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
