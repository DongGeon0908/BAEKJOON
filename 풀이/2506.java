import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] data = new int[count];

		String tmp = br.readLine();
		String[] cnp = tmp.split(" ");

		for (int i = 0; i < count; i++) {
			data[i] = Integer.parseInt(cnp[i]);
		}

		int mid = 0;
		int result = 0;
		for (int i = 0; i < count; i++) {
			if (data[i] == 0) {
				mid = 0;
				result = result + data[i];
			} else {
				mid = mid + 1;
				result = result + mid;
			}
		}
		System.out.print(result);
	}
}
