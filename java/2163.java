import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		System.out.println(n * m - 1);
	}
}

/*
 * 처음에 해당 문제를 풀때 배열을 이용해서 푸는 걸로 접근했다...
 * 어째서 70퍼센트 넘게 맞았는지 궁금했는데...
 * 간단하게 생각해도 무조건 1을 만들려면 N-1번 짤라야 한다..
 * 이런 문제를 풀때는 점화식을 이용하자,,,
 */
