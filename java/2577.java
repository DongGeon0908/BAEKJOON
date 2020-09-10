import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		String[] result = (Integer.toString(num1 * num2 * num3)).split("");

		int[] num = new int[10];
		for (int i = 0; i < result.length; i++) {
			if (result[i].equals("0")) {
				num[0] = num[0] + 1;
			} else if (result[i].equals("1")) {
				num[1] = num[1] + 1;
			} else if (result[i].equals("2")) {
				num[2] = num[2] + 1;
			} else if (result[i].equals("3")) {
				num[3] = num[3] + 1;
			} else if (result[i].equals("4")) {
				num[4] = num[4] + 1;
			} else if (result[i].equals("5")) {
				num[5] = num[5] + 1;
			} else if (result[i].equals("6")) {
				num[6] = num[6] + 1;
			} else if (result[i].equals("7")) {
				num[7] = num[7] + 1;
			} else if (result[i].equals("8")) {
				num[8] = num[8] + 1;
			} else if (result[i].equals("9")) {
				num[9] = num[9] + 1;
			}
		}
		for (int j : num) {
			System.out.println(j);
		}
	}

}
