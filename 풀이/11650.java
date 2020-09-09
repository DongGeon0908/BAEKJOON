
import java.util.Scanner;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		Point[] point = new Point[N];
		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			point[i] = new Point(x, y);
		}
		Arrays.sort(point);

		for (int i = 0; i < N; i++) {
			System.out.println(point[i].x + " " + point[i].y);
		}
	}
}

class Point implements Comparable<Point> {
	Integer x;
	Integer y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point point) {
		if (this.x > point.x)
			return 1;
		else if ((this.x).equals(point.x)) {
			if ((this.y) > point.y) {
				return 1;
			} else if ((this.y).equals(point.y)) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
}
