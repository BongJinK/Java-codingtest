package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	// 2. ��ȣ��������
	// �Էµ� ���ڿ����� �Ұ�ȣ ( ) ���̿� �����ϴ� ��� ���ڸ� �����ϰ�
	// ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
	// ���� ���ڸ� ����Ѵ�.

	private static String sol(String t) {
		StringBuilder ans = new StringBuilder("");

		int cnt = 0;
		for (char x : t.toCharArray()) {
			if (x == '(')
				cnt++;
			else if (x == ')')
				cnt--;
			else if (cnt == 0)
				ans.append(x);
		}
		return ans.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		System.out.println(sol(t));
		br.close();
	}
}
