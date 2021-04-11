import java.util.Scanner;

//얼마나 많은 자연수를 더해야 S가 되는지 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 서로 다른 N개의 자연수의 합
		long S = scan.nextLong();

		int i = 1;
		int result = 0;
		while (true) {
			if (S == 0) {
				break;
			}

			if (S >= i) {
				result = result + 1;
				S = S - i;
				i = i + 1;
			} else {
				break;
			}
		}
		System.out.println(result);
	}

}