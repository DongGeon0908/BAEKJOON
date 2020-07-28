import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();

		if (data < 10) {
			data = data * 10;
		}
		int tmp = 0;
		int result = 0;
		int mid = data;
		while (true) {
			tmp = (data % 10) * 10 + (data / 10 + data % 10) % 10;
			result = result + 1;
			if (tmp == mid) {
				System.out.print(result);
				break;
			} else {
				data = tmp;
				continue;
			}

		}
	}
}
