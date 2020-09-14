
import java.util.Scanner;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = new String[5];
		String[] tmp = new String[15];

		String result = "";
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextLine();
		}

		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = "";
			for (int j = 0; j < input.length; j++) {
				if (input[j].length() >= i + 1) {
					tmp[i] = tmp[i] + input[j].substring(i, i + 1);
				}
			}
			result = result + tmp[i];
		}
		System.out.print(result);
	}
}
