public class Main {
	static int[] data = new int[10001];

	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			selfNumber(i);
		}
		for (int i = 1; i <= 10000; i++) {
			if (data[i] == 0) {
				System.out.println(i);
			}
		}
	}

	public static void selfNumber(int number) {
		int tmp = number;
		while (number != 0) {
			int cnp = number % 10;
			number = number / 10;
			tmp = tmp + cnp;
		}
		if (tmp <= 10000) {
			data[tmp] = 1;
		}
	}

}
