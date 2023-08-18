package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
	// �Ǻ���ġ ���� [ �޸������̼� ]
	// 1) �Ǻ���Ű ������ ����Ѵ�.
	// �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
	// 2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�.
	// ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.
	// ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.
	// ù �ٿ� �Ǻ���ġ ������ ����մϴ�.

	// 10
	// 1 1 2 3 5 8 13 21 34 55

	// �ð����⵵ : O(n)
	// �������⵵ : O(n)
	
	// for �� ����ؼ� �Ǻ���ġ ���� �迭�ϴ� ���� ��ͷ� Ǯ���ϴ� �� ���� ����
	// ��ʹ� �Լ� �ϳ� ȣ��� �� ���� stack�� frame�� �׿��� �޸𸮰� ���� ����
	// for���� �Լ� �ϳ��� frame�� �Ѱ��� ����

	public static void DFS(int n, int i, int j) {
		if (n == 0)
			return;
		System.out.print(i + j + " ");
		DFS(n - 1, j, i + j);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		DFS(n, 1, 0);
		br.close();
	}
}
