package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_0 {
	// �κ����� ���ϱ�(DFS)
	// �ڿ��� N�� �־����� 1���� N������ ���Ҹ� ���� ������
	// �κ������� ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù ��° �ٿ� �ڿ��� N(1<=N<=10)�� �־����ϴ�.
	// ù ��° �ٺ��� �� �ٿ� �ϳ��� �κ������� �Ʒ��� ��¿����� ���� ������ ����Ѵ�.
	// �� �������� ������� �ʽ��ϴ�.

	// 3
	// 1 2 3
	// 1 2
	// 1 3
	// 1
	// 2 3
	// 2
	// 3

	public static void dfs(int n) {
		int[] t = new int[n];
		test(n, 0, t);
	}

	public static void test(int n, int i, int[] t) {
		if (n == i) {
			StringBuilder str = new StringBuilder("");

			for (int s = 0; s < n; s++) {
				if (t[s] != 0)
					str.append(t[s] + " ");
			}
			if (!str.toString().equals(""))
				System.out.println(str.toString());
			return;
		}

		// positive
		t[i] = i + 1;
		test(n, i + 1, t);
		// negative
		t[i] = 0;
		test(n, i + 1, t);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		dfs(n);
		br.close();
	}
}
