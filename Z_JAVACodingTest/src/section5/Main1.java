package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main1 {
	// 1. �ùٸ� ��ȣ [ Stack ]
	// ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
	// (())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������, (()()))�� �ùٸ� ��ȣ�� �ƴϴ�.
	// ù ��° �ٿ� ��ȣ ���ڿ��� �Էµ˴ϴ�. ���ڿ��� �ִ� ���̴� 30�̴�.
	// ù ��° �ٿ� YES, NO�� ����Ѵ�.

	public static String sol(String t) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');

		Stack<Character> s = new Stack<>();

		for (char x : t.toCharArray()) {
			if (x == '(') {
				s.push(x);
			} else if (x == ')') {
				if (s.isEmpty() || map.get(s.peek()) != x)
					return "NO";
				s.pop();
			}
		}
		if (s.isEmpty())
			return "YES";
		return "NO";
	}
	// �ݴ� ��ȣ �� ��� Stack�� ������� �켱 Ȯ�� ��
	// ��� ���� �ʴٸ� *.peek() �̿��Ͽ� �ֱٿ� ���� Data�� value ���� Map���� Ȯ��

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		System.out.println(sol(t));
		br.close();
		solution1(t);
	}

	// ���� ���ǵ��� ��� �����Ǵ� ��� ¦�� �´� ��ȣ�� ���� �˴ϴ�.
	// ���ڿ� s�� ������ ���� ��ȣ��θ� �����Ǿ� �ֽ��ϴ�. ��(�� , ��)�� , ��{�� , ��}�� , ��[�� , ��]��
	// ���� ��ȣ�� ���� ���� ��ȣ�� �ݾƾ� �մϴ�.
	// ���� ��ȣ�� �ݵ�� �ùٸ� ������ �ݾƾ� �մϴ�.
	// ���ڿ� `s`�� �־����� ��, ���ڿ� `s`�� ¦�� �´� ��ȣ�̸� `true`��
	// ¦�� ���� �ʴ� ��ȣ�̸� `false`�� return �ϴ� �Լ��� �ۼ��Ͻÿ�.

	private static Boolean solution1(String s) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> ss = new Stack<>();

		for (char x : s.toCharArray()) {
			if (x == '(' || x == '{' || x == '[')
				ss.push(x);
			else if (x == ')' || x == '}' || x == ']') {
				if (ss.isEmpty() || map.get(ss.peek()) != x)
					return false;
				ss.pop();
			}
		}
		return ss.isEmpty();
	}
}
