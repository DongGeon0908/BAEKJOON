import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] data = new int[n][2];

		for (int i = 0; i < n; i++) {
			data[i][0] = scan.nextInt();
			data[i][1] = scan.nextInt();
		}

		Arrays.sort(data, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2[1], o1[1]);
			}
		});

		int[] tmp = new int[1001];
		for (int i = 0; i < n; i++) {
			for (int j = data[i][0]; j > 0; j--) {
				if (tmp[j] == 0) {
					tmp[j] = data[i][1];
					break;
				}
			}
		}

		int result = 0;
		for (int i : tmp) {
			result = result + i;
		}

		System.out.println(result);

	}
}
