package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
	// 2. �Ƴ��׷�(�ؽ�)
	// Anagram�̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �մϴ�.
	// ���� ��� AbaAeCe �� baeeACA �� ���ĺ��� ���� ������ �ٸ�����
	// �� ������ ���캸�� A(2), a(1), b(1), C(1), e(2)�� ���ĺ��� �� ������ ��� ��ġ�մϴ�.
	// �� ��� �� �ܾ �� �迭�ϸ� ����� �ܾ �� �� �ִ� ���� �Ƴ��׷��̶� �մϴ�.
	// ���̰� ���� �� ���� �ܾ �־����� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���.
	// �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�.
	// ù �ٿ� ù ��° �ܾ �Էµǰ�, �� ��° �ٿ� �� ��° �ܾ �Էµ˴ϴ�.
	// �ܾ��� ���̴� 100�� ���� �ʽ��ϴ�.
	// �� �ܾ �Ƴ��׷��̸� ��YES"�� ����ϰ�, �ƴϸ� ��NO"�� ����մϴ�.
	// AbaAeCe
	// baeeACA yes

	// abaCC
	// Caaab no

	// ��� 1 : 2���� map ��
	public static String sol(char[] a, char[] b) {
		Map<Character, Integer> map = new HashMap<>();
		for (char x : a)
			map.put(x, map.getOrDefault(x, 0) + 1);

		Map<Character, Integer> map2 = new HashMap<>();
		for (char x : b)
			map2.put(x, map2.getOrDefault(x, 0) + 1);

		for (char x : map.keySet()) {
			if (map.get(x) != map2.get(x))
				return "NO";
		}
		return "YES";
	}

	// ��� 2 : ���� map ������ �ϳ��� -1 �ذ��� ��
	public static String sol2(char[] a, char[] b) {
		Map<Character, Integer> map = new HashMap<>();
		for (char x : a)
			map.put(x, map.getOrDefault(x, 0) + 1);

		for (char x : b) {
			if (!map.containsKey(x) || map.get(x) == 0)
				return "NO";
			map.put(x, map.get(x) - 1);
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();

		System.out.println(sol(a, b));
	}
}
