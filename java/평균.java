import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.parseInt(scan.nextLine());
		String num2 = scan.nextLine();

		String[] num = num2.split("\\s");
		double[] numD = new double[num1];

		for (int k = 0; k < num1; k++) {
			numD[k] = Integer.parseInt(num[k]);
		}

		double tmp;
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num1 - i - 1; j++) {
				if (numD[j] > numD[j + 1]) {
					tmp = numD[j];
					numD[j] = numD[j + 1];
					numD[j + 1] = tmp;
				}
			}
		}
		double max = numD[num1 - 1];
		double avg = 0;
		for (int p = 0; p < num1; p++) {
			numD[p] = numD[p] / max * 100;
			avg = avg + numD[p];
		}

		System.out.println(avg / num1);
	}
}
