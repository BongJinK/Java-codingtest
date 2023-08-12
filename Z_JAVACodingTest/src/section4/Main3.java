package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
	// ������� ����
	// �����ƺ��� �������� N�� ������ �������� �ְ�
	// ���ӵ� K�� ������ ������� ������ �� �������� ���϶�� �߽��ϴ�.
	// ���� N=7�̰� 7�� ���� �������� �Ʒ��� ����, �̶� K=4�̸�
	// 20 12 20 10 23 17 10
	// �� ���� 4�ϰ��� ������ ����������
	// ù ��° ������ [20, 12, 20, 10]�� ������� ������ 20, 12, 10���� 3�̴�.
	// �� ��° ������ [12, 20, 10, 23]�� ������� ������ 4�̴�.
	// �� ��° ������ [20, 10, 23, 17]�� ������� ������ 4�̴�.
	// �� ��° ������ [10, 23, 17, 10]�� ������� ������ 3�̴�.
	// N�ϰ��� �����ϰ� ���ӱ����� ���� K�� �־����� ù ��° �������� �� ������
	// ������� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù �ٿ� N(5<=N<=100,000)�� K(2<=K<=N)�� �־����ϴ�.
	// �� ��° �ٿ� N���� ���ڿ��� �־����ϴ�. �� ���ڴ� 500������ ���� �ƴ� �����Դϴ�.
	// ù �ٿ� �� ������ ����� ������ ������� ����մϴ�.

	// 7 4
	// 20 12 20 10 23 17 10
	// >> 3 4 4 3

	public static String sol(int n, int k, String[] s) {
		StringBuilder str = new StringBuilder("");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < k - 1; i++)
			map.put(s[i], map.getOrDefault(s[i], 0) + 1);

		int lt = 0;
		int rt = k - 1;
		while (rt < n) {
			map.put(s[rt], map.getOrDefault(s[rt], 0) + 1);
			str.append(map.size() + " ");

			map.put(s[lt], map.get(s[lt]) - 1);
			if (map.get(s[lt]) == 0)
				map.remove(s[lt]);
			lt++;
			rt++;
		}
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		String[] s = br.readLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		System.out.println(sol(n, k, s));
	}
}
