package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08_0 {
	// �۾��� ã��(BFS : ����Ʈ��Ž��)
	// �۾������� ��ġ�����Ⱑ �޷� �ִ�.
	// ������ ��ġ�� �۾����� ��ġ�� ���������� ��ǥ ������ �־�����
	// ������ ���� ��ġ���� �۾����� ��ġ���� ������ ���� ������� �̵��Ѵ�.
	// �۾����� �������� �ʰ� ���ڸ��� �ִ�.
	// ������ ��ī�� ������ Ÿ�� ���µ� �� ���� ������ ������ 1, �ڷ� 1, ������ 5�� �̵��� �� �ִ�.
	// �ּ� �� ���� ������ ������ �۾����� ��ġ���� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.

	// ù ��° �ٿ� ������ ��ġ S�� �۾����� ��ġ E�� �־�����.
	// ������ ��ǥ ���� 1���� 10,000�����̴�.
	// ������ �ּ�Ƚ���� ���Ѵ�. ���� 1�̻��̸� �ݵ�� �����մϴ�.

	// ��1
	// 5 14
	// 3

	// ��2
	// 8 3
	// 5
	public static void BFS(int s, int e) {
		int cnt = 0;

		int for1 = 1;
		int for5 = 5;
		int back1 = -1;

		while (s != e) {
			if (s > e)
				s += back1;
			else {
				int f1 = Math.abs(e - (s + for1));
				int f5 = Math.abs(e - (s + for5));

				if (f1 < f5)
					s += for1;
				else
					s += for5;
			}
			cnt++;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] se = br.readLine().split(" ");
		int s = Integer.parseInt(se[0]);
		int e = Integer.parseInt(se[1]);

		BFS(s, e);
		br.close();
	}
}
