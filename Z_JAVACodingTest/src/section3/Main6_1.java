package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main6_1 {
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
	
	// ���� Ǭ ��� [0�� �ε��� �迭 ����]
	public static int sol(int n, int k, List<Integer> list) {
		// System.out.println(list);
		int ans = 0, lp = 0, rp = 0;
		int len = 0;

		for (int i = 0; i < list.size() - k - 1; i++) {
			lp = list.get(i);
			rp = list.get(i + k + 1);
			len = rp - lp - 1;
			// System.out.println("lp : " + lp + " / rp : " + list.get(i + k));
			// System.out.println(len);
			ans = Math.max(ans, len);
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		String[] a = br.readLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (a[i].equals("0"))
				list.add(i);
		}
		list.add(0, -1);
		list.add(n);
		System.out.println(sol(n, k, list));
	}
}
