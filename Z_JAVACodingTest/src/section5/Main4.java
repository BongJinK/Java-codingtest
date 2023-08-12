package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4 {

	// 4. ������ ����(postfix)
	// ����������� �־����� ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� 3*(5+2)-9 �� ������������� ǥ���ϸ� 352+*9- �� ǥ���Ǹ� �� ����� 12�Դϴ�.
	// ù �ٿ� ����������� �־����ϴ�. ������� ���̴� 50�� ���� �ʽ��ϴ�.
	// ���� 1~9�� ���ڿ� +, -, *, / �����ڷθ� �̷������.
	// ������ ����� ����մϴ�.
	// 352+*9-

	public static int sol(String t) {
		int ans = 0;
		Stack<Integer> stack = new Stack<>();

		for (char x : t.toCharArray()) {
			if (Character.isDigit(x))
				stack.push(x - 48);
			else {
				int n2 = stack.pop();
				int n1 = stack.pop();
				int result = operation(n1, n2, x);
				stack.push(result);
			}
		}
		ans = stack.pop();
		return ans;
	}

	private static int operation(int n1, int n2, char x) {
		int ans = 0;
		switch (x) {
		case '+':
			ans = n1 + n2;
			break;
		case '-':
			ans = n1 - n2;
			break;
		case '*':
			ans = n1 * n2;
			break;
		case '/':
			ans = n1 / n2;
			break;
		}

		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		System.out.println(sol(t));
		br.close();
	}
}
