package section7;

import java.util.Scanner;

public class Main06_1 {
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

	static int n;
	// �κ����� ��� �迭
	// check[i] = 1 �̶�� i+1�� �κ��������� ������ �ִ� ��
	static int[] check;

	public static void DFS(int level) {
		if (n == level) {
			for (int i = 0; i < n; i++) {
				if (check[i] != 0)
					System.out.print(i + 1 + " ");
			}
			System.out.println();
			return;
		}

		// positive
		check[level] = 1;
		DFS(level + 1);
		// negative
		check[level] = 0;
		DFS(level + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check = new int[n];
		// level�� 0[lv.1]���� �����ؼ� n-1[lv.n]���� Ž��
		DFS(0);
		sc.close();
	}
}
