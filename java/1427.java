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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		String[] tmp = data.split("");

		int[] number = new int[tmp.length];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(tmp[i]);
		}

		sort(number, 0, (number.length - 1));

		for (int j = number.length - 1; j >= 0; j--) {
			System.out.print(number[j]);
		}
	}
}
