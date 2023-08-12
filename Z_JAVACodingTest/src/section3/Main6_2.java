package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6_2 {
	// �ڡڡڡ� 
	// �ִ� ���� ���Ӻκм���
	// 0�� 1�� ������ ���̰� N�� ������ �־����ϴ�.
	// �������� �� �������� �ִ� k���� 0�� 1�� ������ �� �ֽ��ϴ�.
	// �������� �ִ� k���� ������ ���� �� �������� 1�θ� ������ �ִ� ������
	// ���Ӻκм����� ã�� ���α׷��� �ۼ��ϼ���.
	// ���� ���̰� ���̰� 14�� ������ ���� ������ �־����� k=2���
	// 1 1 0 0 1 1 0 1 1 0 1 1 0 1
	// �������� ���� �� �ִ� 1�� ���ӵ� ���Ӻκм�����
	// 1 1 0 0 [1 1 1 1 1 1 1 1] 0 1
	// �̸� ���̴� 8�̴�.
	
	public static int sol(int n, int k, int[] arr) {
		int answer = 0, lt = 0;
		int cnt = 0;

		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0)
				cnt++;
			while (cnt > k) {
				if (arr[lt] == 0)
					cnt--;
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		String[] a = br.readLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(a[i]);

		System.out.println(sol(n, k, arr));
	}

}
