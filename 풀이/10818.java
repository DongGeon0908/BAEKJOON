import java.util.Scanner;

public class Main {
	public static int partition(int a[], int low, int high) {

		int i = low;
		int j = high + 1;
		int tmp;
		while (true) {
			while (a[++i] < a[low]) {
				if (i == high) {
					break;
				}
			}
			while (a[low] < a[--j]) {
				if (i == low) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;

		}
		tmp = a[low];
		a[low] = a[j];
		a[j] = tmp;
		return j;

	}

	public static void sort(int a[], int low, int high) {

		if (low >= high) {
			return;
		}

		int pivot = partition(a, low, high);

		sort(a, low, pivot - 1);

		sort(a, pivot + 1, high);

	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] num = new int[count];

		for (int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}

		sort(num, 0, num.length - 1);
		System.out.print(num[0] + " " + num[count - 1]);
	}
}
