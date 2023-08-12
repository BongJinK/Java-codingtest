package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12 {
	// �ڡڡڡڡڡڡڡ�
	// ���丵
	// ������ �� �������� �� �л����� ���������� ����Ű�� ���� ���丵 �ý����� ������� �մϴ�.
	// ���丵�� ����(�����ִ� �л�)�� ��Ƽ(������ �޴� �л�)�� �� ¦�� �Ǿ� ���䰡 ��Ƽ�� ���а��θ� �����ִ� ���Դϴ�.
	// �������� M���� �����׽�Ʈ ����� ������ ����� ��Ƽ�� ���մϴ�.
	// ���� A�л��� �����̰�, B�л��� ��Ƽ�� �Ǵ� ¦�� �Ǿ��ٸ�,
	// A�л��� M���� �����׽�Ʈ���� ��� B�л����� ����� �ռ��� �մϴ�. [�ڡڡڡڡڡڡڡ�]
	// M���� ���м����� �־����� ����� ��Ƽ�� �Ǵ� ¦�� ���� �� �ִ� ��찡 �� �� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

	// ù ��° �ٿ� �� �л� �� N(1<=N<=20)�� M(1<=M<=10)�� �־�����.
	// �� ��° �ٺ��� M���� �ٿ� ���� �����׽�Ʈ ����� �л���ȣ�� �־�����.
	// �л���ȣ�� ���� �տ������� 1��, 2��, ...N�� ������ ǥ���ȴ�.
	// ���� �� �ٿ� N=4�̰�, �׽�Ʈ ����� 3 4 1 2�� �ԷµǾ��ٸ�
	// 3�� �л��� 1��, 4�� �л��� 2��, 1�� �л��� 3��, 2�� �л��� 4���� �ǹ��մϴ�.

	// ù ��° �ٿ� ¦�� ���� �� �ִ� �� ��츦 ����մϴ�.

	// 4[�л� ��] 3[�׽�Ʈ ��]
	// 3 4 1 2
	// 4 3 2 1
	// 3 1 4 2
	// 3
	// 3,1 3,2 4,2
	// 1,6 2,6 3,1 3,2 3,6 4,2 4,6 5,6

	// i+1 : �����л���ȣ , j+1 : ��Ƽ�л���ȣ
	// k : m�������� ����
	// s : ���� ��� Ȯ��

	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int cnt = 0;
				if (i == j)
					continue;
				for (int k = 0; k < m; k++) {
					int mento = 0, menti = 0;
					for (int s = 0; s < n; s++) {
						if (arr[k][s] == i + 1)
							mento = s;
						if (arr[k][s] == j + 1)
							menti = s;
					}
					// �ε��� �� ������ ����� ��Ƽ�� ������� ���ƾ��ϹǷ� ex) 1��, 3��
					if (mento < menti)
						cnt++;
				}
				if (cnt == m)
					answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main12 t12 = new Main12();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String c = br.readLine();
		int n = Integer.parseInt(c.split(" ")[0]);
		int m = Integer.parseInt(c.split(" ")[1]);
		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			String[] t = br.readLine().split(" ");
			for (int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(t[j]);
		}

		System.out.println(t12.solution(n, m, arr));
		br.close();
	}
}
