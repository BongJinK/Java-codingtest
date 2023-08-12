package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2 {
	// 2. ��ȣ��������
	// �Էµ� ���ڿ����� �Ұ�ȣ ( ) ���̿� �����ϴ� ��� ���ڸ� �����ϰ�
	// ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
	// ���� ���ڸ� ����Ѵ�.

	// Stack �̻��
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

	// Stack ���
	public static String sol1(String t) {
		StringBuilder str = new StringBuilder();
		Stack<Character> s = new Stack<>();

		for (char x : t.toCharArray()) {
			if (x == ')')
				while (s.pop() != '(')
					;
			else
				s.push(x);
		}

		for (char x : s)
			str.append(x);
		//for (int i = 0; i < s.size(); i++)
		//	str.append(s.get(i));
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		System.out.println(sol(t));
		br.close();
	}
}
