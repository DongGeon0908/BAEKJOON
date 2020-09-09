
import java.util.Scanner;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		Point[] point = new Point[N];
		for (int i = 0; i < N; i++) {
			int age = scan.nextInt();
			String name = scan.nextLine();
			point[i] = new Point(age, name);
		}
		Arrays.sort(point);

		for (int i = 0; i < N; i++) {
			System.out.println(point[i].age + point[i].name);
		}
	}
}

class Point implements Comparable<Point> {
	Integer age;
	String name;

	Point(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Point point) {
		if (this.age > point.age) {
			return 1;
		} else if ((this.age).equals(point.age)) {
			return 0;
		} else {
			return -1;
		}
	}
}
