import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void sort(int[] a) {
		int n = a.length;
		int[] aux = new int[n]; 
		sort(a, 0, n - 1, aux);

	}

	private static void sort(int[] a, int low, int high, int[] aux) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		sort(a, low, mid, aux);
		sort(a, mid + 1, high, aux);
		merge(a, low, mid, high, aux);
	}

	private static void merge(int[] a, int low, int mid, int high, int[] aux) {
		int i = low;
		int j = mid + 1;
		int k = low;

		while (k <= high) {
			if (i > mid) {
				aux[k++] = a[j++];
			} else if (j > high) {
				aux[k++] = a[i++];
			} else if (a[i] > a[j]) {
				aux[k++] = a[j++];
			} else {
				aux[k++] = a[i++];
			}
		}
		for (k = low; k <= high; k++) {
			a[k] = aux[k];
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int count = Integer.parseInt(br.readLine());
		int[] data = new int[count];

		for (int i = 0; i < count; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}

		Main.sort(data);

		for (int a : data) {
			System.out.println(a);
		}

	}
}
