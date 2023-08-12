package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main6 {
	// 6. ���� ���ϱ�
	// ���� �ձ��� �̿� ���� �ܵ��� ���ְ� ������ �������� ���������ϴ�.
	// ���� �ձ����� ���ڰ� N���� �ִµ� ���� ���ָ� ���Ϸ� ���ڴٰ� �մϴ�.
	// �����ձ��� ���� ������ ���� ������� ���ָ� ���Ϸ� �� ���ڸ� �����ϱ�� �߽��ϴ�.
	// ���� ���ڵ��� ���� ������ 1������ N������ ���ʷ� ��ȣ�� �ű��.
	// �׸��� 1�� ���ں��� N�� ���ڱ��� ������� �ð� �������� ���ư��� ���׶��� �ɰ� �Ѵ�.
	// �׸��� 1�� ���ں��� �ð�������� ���ư��� 1���� �����Ͽ� ��ȣ�� ��ġ�� �Ѵ�.
	// �� ���ڰ� K(Ư������)�� ��ġ�� �� ���ڴ� ���ָ� ���Ϸ� ���µ��� ���ܵǰ� �� ������ ������ �ȴ�.
	// �׸��� ���� ���ں��� �ٽ� 1���� �����Ͽ� ��ȣ�� ��ģ��.
	// �̷��� �ؼ� ���������� ���� ���ڰ� ���ָ� ���Ϸ� �� �� �ִ�.
	// Image1.jpg
	// ���� ��� �� 8���� ���ڰ� �ְ�, 3�� ��ģ ���ڰ� ���ܵȴٰ� ����.
	// ó������ 3�� ���ڰ� 3�� ���� ���ܵȴ�.
	// �̾� 6, 1, 5, 2, 8, 4�� ���ڰ� ���ʴ�� ���ܵǰ� ���������� ���� �� 7�� ���ڿ��� ���ָ� ���Ϸ����ϴ�.
	// N�� K�� �־��� �� ���ָ� ���Ϸ� �� ������ ��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// ù �ٿ� �ڿ��� N(5<=N<=1,000)�� K(2<=K<=9)�� �־�����.
	// ù �ٿ� ������ ���� ������ ��ȣ�� ����մϴ�.
	// 8 3
	// 7

	public static int sol(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++)
			q.offer(i);

		while (!q.isEmpty()) {
			for (int i = 0; i < k - 1; i++)
				q.offer(q.poll());
			q.poll();
			if (q.size() == 1)
				break;
		}
		return q.poll();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		System.out.println(sol(n, k));
		br.close();
	}
}
