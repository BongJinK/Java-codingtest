package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Patient {
	// ��� ��ȣ�� ���赵(�켱����)
	int num;
	int priority;

	public Patient(int order, int severity) {
		num = order;
		priority = severity;
	}
}

public class Main8 {
	// 8. ���޽�
	// �޵��� ���� ���޽ǿ��� �ǻ簡 �� ��ۿ� �����ϴ�.
	// ���޽��� "ȯ�ڰ� ������ ������� ����"�� �մϴ�.
	// ������ ���赵�� ���� ȯ�ڴ� ���� ������ġ�� �ǻ簡 �ؾ� �մϴ�.

	// �̷� ������ �����ϱ� ���� ���޽��� ������ ���� ������� ȯ���� ��������� ���մϴ�.
	// 1. ȯ�ڰ� ������ ��������� ��Ͽ��� ���� �տ� �ִ� ȯ�ڸ���� �����ϴ�.
	// 2. ������ "��� ��Ͽ��� ���� ȯ�� ���� ���赵�� ���� ȯ�ڰ� ����"�ϸ�
	// ����� "���� �ڷ�" �ٽ� �ֽ��ϴ�. �׷��� ������ ���Ḧ �޽��ϴ�.
	// 3. ��, ����Ͽ� �ڱ� ���� ���赵�� ���� ȯ�ڰ� ���� �� �ڽ��� ���Ḧ �޴� ����

	// ���� N���� ȯ�ڰ� ����Ͽ� �ֽ��ϴ�.
	// N���� ����� ������ ȯ�� ���赵�� �־�����,
	// ����ϻ��� M��° ȯ�ڴ� �� ��°�� ���Ḧ �޴��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ����ϻ��� M��°�� ������� ���� ó�� ȯ�ڸ� 0��°�� �����Ͽ� ǥ���� ���Դϴ�.
	// ù �ٿ� �ڿ��� N(5<=N<=100)�� M(0<=M<N) �־����ϴ�.
	// �� ��° �ٿ� ������ ������� ȯ���� ���赵(50<=���赵<=100)�� �־����ϴ�.
	// ���赵�� ���� ���� ���� �� �����ϴٴ� ���Դϴ�. ���� ���� ���赵�� ������ �� �ֽ��ϴ�.
	// M��° ȯ�ڴ� �� ��°�� ���Ḧ �޴��� ���

	public static int sol(int n, int m, int[] war) {
		Queue<Patient> pq = new LinkedList<>();
		for (int i = 0; i < n; i++)
			pq.offer(new Patient(i, war[i]));

		int count = 0;
		while (!pq.isEmpty()) {
			Patient ck = pq.poll();
			for (Patient patient : pq) {
				if (ck.priority < patient.priority) {
					pq.offer(ck);
					ck = null;
					break;
				}
			}

			if (ck != null) {
				count++;
				if (ck.num == m)
					return count;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);

		String[] w = br.readLine().split(" ");
		int[] war = new int[n];
		for (int i = 0; i < n; i++)
			war[i] = Integer.parseInt(w[i]);

		System.out.println(sol(n, m, war));
		br.close();
	}
}
