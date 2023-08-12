package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
	// ���ӵ� �ڿ����� ��
	// N�Է����� ���� ���� N�� �ԷµǸ�
	// 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� N=15�̸�
	// 7+8=15
	// 4+5+6=15
	// 1+2+3+4+5=15

	public static int sol(int target) {
		int sum = 0, p = 1, cnt = 0;
		int max = target / 2 + 1;

		for (int i = 1; i <= max; i++) {
			sum += i;
			while (sum > target)
				sum -= p++;
			if (sum == target)
				cnt++;
		}
		return cnt;
	}

	// �������� ��� �ڡڡڡڡڡ�
	public static int solution(int target) {
		int answer = 0;
		int cnt = 1;
		target--;
		while (target > 0) {
			cnt++;
			target -= cnt;
			if (target % cnt == 0)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		System.out.println(sol(target));
	}
}
