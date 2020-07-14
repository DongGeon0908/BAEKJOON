import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		double[] caseResult = new double[testcase];
		for (int i = 0; i < testcase; i++) {
			int caseNum = scan.nextInt();
			int result = 0;
			int[] core = new int[caseNum];
			for (int j = 0; j < caseNum; j++) {
				int tmp = scan.nextInt();
				core[j] = tmp;
				result = result + tmp;
			}
			double avg = result / caseNum;

			int print = 0;
			for (int k = 0; k < caseNum; k++) {
				if (core[k] > avg) {
					print = print + 1;
				}
			}
			caseResult[i] = (double) print / caseNum * 100;
		}
		for (int i = 0; i < testcase; i++) {
			System.out.printf("%.3f", caseResult[i]);
			System.out.println("%");
		}
	}
}
