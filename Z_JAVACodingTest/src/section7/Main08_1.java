package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main08_1 {
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

	static int level;
	static int[] distinct = { 1, -1, 5 };
	static int[] check;
	static Queue<Integer> Q = new LinkedList<>();

	public static int BFS(int s, int e) {
		check = new int[10001];
		check[s] = 1;
		Q.offer(s);
		level = 0;

		while (!Q.isEmpty()) {
			int len = Q.size();

			for (int i = 0; i < len; i++) {
				int x = Q.poll();

				for (int j = 0; j < 3; j++) {
					int nx = x + distinct[j];
					if (nx == e)
						return level + 1;
					if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
						check[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			level++;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] se = br.readLine().split(" ");
		int s = Integer.parseInt(se[0]);
		int e = Integer.parseInt(se[1]);

		System.out.println(BFS(s, e));
		br.close();
	}
}
