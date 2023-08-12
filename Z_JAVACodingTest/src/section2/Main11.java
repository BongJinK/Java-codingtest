package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {
	// �ӽù��� ���ϱ�
	// �ӽ÷� ������ ���ϰ� �л����� ���� ģ������ �Ŀ�, ���Ÿ� ���� ������ ����.
	// �л� �߿��� 1�г���� "[5�г�]"���� �������鼭
	// �ѹ��̶� ���� ���̾��� ����� ���� ���� �л��� �ӽ� ����.
	// �׷��� �� �л����� 1�г���� 5�г���� �� �ݿ� ���߾������� ��Ÿ���� ǥ ����.
	// ���� ��� �л� ���� 5���� ���� ǥ�� ���캸��
	// ù �ٿ� �ӽ� �������� ������ �л��� ��ȣ�� ����Ѵ�.
	// ��, �ӽ� ������ �� �� �ִ� �л��� ���� ���� ��쿡�� �� �� ���� ���� ��ȣ�� ����Ѵ�.

	// 5
	// 2 3 1 7 3
	// 4 1 9 6 8
	// 5 5 2 4 4
	// 6 5 2 6 7
	// 8 4 2 2 2

	// i : a�л�, j : ��, k : ���� �г� �л�
	public int solution(int n, int[][] arr) {
		int ans = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int[] ck = new int[n];
			int c = 0;
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < n; k++) 
					// a�л��� 1~5�г� ������ ������ �л� ���� �Ǻ�
					if (ck[k] == 0 && arr[i][j] == arr[k][j])
						ck[k] = 1;
			}
			for (int k = 0; k < n; k++)
				if (ck[k] == 1)
					c++;
			if (c > cnt) {
				cnt = c;
				ans = i + 1;
			}
		}
		return ans;
	}
	
	// i : a�л�, j : b�л�, k : ��
	public int sol(int n, int[][] arr) {
		int ans = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int c = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					// a�л��� b�л��� �� ��
					if (arr[i][k] == arr[j][k]) {
						c++;
						break;
					}
				}
			}
			if (c > cnt) {
				cnt = c;
				ans = i + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Main11 t11 = new Main11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][5];

		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().split(" ");
			for (int j = 0; j < 5; j++)
				arr[i][j] = Integer.parseInt(t[j]);
		}

		System.out.println(t11.solution(n, arr));
		br.close();
	}
}
