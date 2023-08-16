package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	// ����Լ��� �̿��� ������ ���
	// 10���� N�� �ԷµǸ� 2������ ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// �� ����Լ��� �̿��ؼ� ����ؾ� �մϴ�.
	// ù ��° �ٿ� 10���� N(1<=N<=1,000)�� �־����ϴ�.
	// ù ��° �ٿ� �������� ����ϼ���.

	// 11
	// 1011

	public static void DFS(int n) {
		if (n == 0)
			return;

		DFS(n / 2);
		System.out.print(n % 2);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		DFS(n);
		br.close();
	}
}
