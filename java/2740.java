import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int AN = scan.nextInt();
		int AM = scan.nextInt();
		int[][] A = new int[AN][AM];

		for (int i = 0; i < AN; i++) {
			for (int j = 0; j < AM; j++) {
				A[i][j] = scan.nextInt();
			}
		}

		int BN = scan.nextInt();
		int BM = scan.nextInt();
		int[][] B = new int[BN][BM];

		for (int i = 0; i < BN; i++) {
			for (int j = 0; j < BM; j++) {
				B[i][j] = scan.nextInt();
			}
		}

		int[][] result = new int[AN][BM];
		for (int i = 0; i < AN; i++) {
			for (int j = 0; j < BM; j++) {
				for (int k = 0; k < BN; k++) {
					result[i][j] = result[i][j] + A[i][k] * B[k][j];
				}
			}
		}

		for (int i = 0; i < AN; i++) {
			for (int j = 0; j < BM; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}
