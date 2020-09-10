import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long Min = scanner.nextLong();
		long Max = scanner.nextLong();
		int N = (int) (Max - Min + 1);
		boolean[] Data = new boolean[N];

		for (long i = 2; i * i <= Max; i++) {
			long tmp = Min / (i * i);
			long cnp = Max / (i * i);
			if (Min % (i * i) == 0) {
				for (long j = tmp; j <= cnp; j++) {
					Data[(int) (i * i * j - Min)] = true;
				}
			} else {
				for (long j = tmp + 1; j <= cnp; j++) {
					Data[(int) (i * i * j - Min)] = true;
				}
			}
		}
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (Data[i] != true) {
				result = result + 1;
			}
		}
		System.out.println(result);
	}

}
