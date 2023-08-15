package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// �ڡڡڡڡ� �߿�
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
	// this Object : ������� ���ĵǾ� �ִ� ����
	// �������� : this - o; [object�� -�ٿ� ���� �ͺ��� �����ϰڴٶ�� �ǹ�]

//	@Override
//	public int compareTo(Point7 o) {
//		if (this.x == o.x)
//			return o.y - this.y;
//		else
//			return o.x - this.x;
//	}
	// �������� : o - this; [object�� +�ٿ� ū �ͺ��� �����ϰڴٶ�� �ǹ�]
}

public class Main07_0 {
	// 7. ��ǥ ����
	// N���� ������ ��ǥ(x, y)�� �־����� ��� ��ǥ�� ������������ �����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���ı����� ���� x���� ���ؼ� �����ϰ�, x���� ���� ��� y���� ���� �����մϴ�.
	// ù° �ٿ� ��ǥ�� ������ N(3<=N<=100,000)�� �־����ϴ�.
	// �� ��° �ٺ��� N���� ��ǥ�� x, y ������ �־����ϴ�. x, y���� ����� �Էµ˴ϴ�.
	// N���� ��ǥ�� �����Ͽ� ����ϼ���.

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

		// Collections.sort : Point7 class�� compareTo() �޼��� ����
		Collections.sort(list);
		for (Point7 p : list)
			System.out.println(p.x + " " + p.y);
		br.close();
	}
}
