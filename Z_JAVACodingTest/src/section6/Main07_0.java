package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ★★★★★ 중요
class Point7 implements Comparable<Point7> {
	public int x, y;

	public Point7(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point7 o) {
		if (this.x == o.x)
			return this.y - o.y;
		else
			return this.x - o.x;
	}
	// this Object : 순서대로 정렬되어 있다 생각
	// 오름차순 : this - o; [object에 -붙여 작은 것부터 정렬하겠다라는 의미]

//	@Override
//	public int compareTo(Point7 o) {
//		if (this.x == o.x)
//			return o.y - this.y;
//		else
//			return o.x - this.x;
//	}
	// 내림차순 : o - this; [object에 +붙여 큰 것부터 정렬하겠다라는 의미]
}

public class Main07_0 {
	// 7. 좌표 정렬
	// N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
	// 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
	// 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
	// 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
	// N개의 좌표를 정렬하여 출력하세요.

	// 5
	// 2 7
	// 1 3
	// 1 2
	// 2 5
	// 3 6

	// 1 2
	// 1 3
	// 2 5
	// 2 7
	// 3 6

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		List<Point7> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			list.add(new Point7(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
		}

		// Collections.sort : Point7 class의 compareTo() 메서드 동작
		Collections.sort(list);
		for (Point7 p : list)
			System.out.println(p.x + " " + p.y);
		br.close();
	}
}
