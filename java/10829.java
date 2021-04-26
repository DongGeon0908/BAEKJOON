import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Long N = scan.nextLong();

		System.out.println(Long.toBinaryString(N));

	}
}

/*
* 처음 int형으로 했을때, 범위를 넘어가서 실패했다.
* int - > Long
*/
