package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main5 {
	// 5. K��° ū ��
	// ������ 1���� 100������ �ڿ����� ���� N���� ī�带 ������ �ֽ��ϴ�.
	// ���� ������ ī�尡 ������ ���� �� �ֽ��ϴ�.
	// ������ �� �� 3���� �̾� �� ī�忡 ���� ���� ���� ���� ����Ϸ��� �մϴ�.
	// 3���� ���� �� �ִ� ��� ��츦 ����մϴ�.
	// ����� �� �� K��°�� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� ū ������ ������� ���� 25 25 23 23 22 20 19......�̰�
	// K���� 3�̶�� K��° ū ���� 22�Դϴ�.
	// ù �ٿ� �ڿ��� N(3<=N<=100)�� K(1<=K<=50) �Էµǰ�, �� ���� �ٿ� N���� ī�尪�� �Էµȴ�.
	// ù �ٿ� K��° ���� ����մϴ�. K��° ���� �������� ������ -1�� ����մϴ�.

	// 1 2 3 4 5 6
	// 123, 124, 125, 126
	// 134, 135, 136
	// 145, 146
	// 156
	// 234, 235, 236
	// 245, 246
	// 256
	// 345, 346
	// 356
	// 456

	public static int sol(int n, int k, int[] num) {
		// Collections.reverseOrder() : �������� ����
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
		int answer = -1;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int s = j + 1; s < n; s++)
					set.add(num[i] + num[j] + num[s]);
			}
		}

		if (set.size() < k)
			return answer;
		answer = (int) set.toArray()[k - 1];
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		String[] c = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = Integer.parseInt(c[i]);

		System.out.println(sol(n, k, num));
	}
}
