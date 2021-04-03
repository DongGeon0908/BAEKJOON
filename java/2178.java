import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// BFS -> 큐로 구현
// 동건버전..

/* 클래스를 큐에 담을 생각
 * 큐에서 다음 방향을 찾을때 배열을 가지고 사용하는 생각
 * 기타 등등 어떻게 생각하지..
 * */

class Node {
	private int x;
	private int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}

public class  {

	public static int n, m;
	public static int[][] graph = new int[201][201];

	// 이동할 방향을 static으로 선언
	public static int dx[] = { -1, 1, 0, 0 };
	public static int dy[] = { 0, 0, -1, 1 };

	public static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y)); // 자료를 순차적으로 보관

		while (q.isEmpty() == false) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < dx.length; i++) {
				
				// 다음 지점
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 외부로 나가면 끝내기
				if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}

				// 벽이면 끝내기
				if (graph[nx][ny] == 0) {
					continue;
				}

				if (graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node(nx, ny)); // 해당 코드에 대한 분석 필요
				}
			}
		}

		// 쌓이고 쌓인 결과값
		return graph[n - 1][m - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N, M을 공백을 기준으로 구분하여 입력 받기
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기

		// 2차원 리스트의 맵 정보 입력 받기
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		// BFS를 수행한 결과 출력
		System.out.println(bfs(0, 0));
	}
}
