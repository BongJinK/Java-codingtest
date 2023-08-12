package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	// ���� �κм���
	// N���� ���� �̷���� ������ �־����ϴ�.
	// �� �������� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ��찡 �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� N=8, M=6�̰� ������ ������ ���ٸ�
	// 1 2 1 3 1 1 1 2
	// ���� 6�� �Ǵ� ���Ӻκм����� {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}�� �� 3�����Դϴ�.
	// ù° �ٿ� N(1��N��100,000), M(1��M��100,000,000)�� �־�����.
	// ������ ���Ұ��� 1,000�� ���� �ʴ� �ڿ����̴�.

	// sliding window

	public static int sol(int n, int m, List<Integer> list) {
		int cnt = 0, sum = 0;
		int pointer = 0;

		for (int i = 0; i < n; i++) {
			sum += list.get(i);
			if (sum == m) 
				cnt++;
			while (sum >= m)
				sum -= list.get(pointer++);
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nm = br.readLine();
		String text = br.readLine();

		int n = Integer.parseInt(nm.split(" ")[0]);
		int m = Integer.parseInt(nm.split(" ")[1]);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(Integer.parseInt(text.split(" ")[i]));

		System.out.println(sol(n, m, list));
	}
}
