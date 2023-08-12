package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main4 {
	// 4. ��� �Ƴ��׷� ã��
	// S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� S�� �κй��ڿ��� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
	// �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�. �κй��ڿ��� ���ӵ� ���ڿ��̾�� �մϴ�.
	// ù �ٿ� ù ��° S���ڿ��� �Էµǰ�, �� ��° �ٿ� T���ڿ��� �Էµ˴ϴ�.
	// S���ڿ��� ���̴� 10,000�� ���� ������, T���ڿ��� S���ڿ����� ���̰� �۰ų� �����ϴ�.
	// S�ܾ T���ڿ��� �Ƴ��׷��� �Ǵ� �κй��ڿ��� ������ ����մϴ�.

	// bacaAacba
	// 012345678 : 9
	// abc
	// 3
	// sol ���� sol1�� �� ����

	public static int sol(String s, String t) {
		Map<Character, Integer> tmap = new HashMap<>();
		for (char x : t.toCharArray())
			tmap.put(x, tmap.getOrDefault(x, 0) + 1);

		int answer = 0;
		int lt = 0;

		for (int rt = t.length() - 1; rt < s.length(); rt++) {
			Map<Character, Integer> smap = new HashMap<>();
			for (int i = lt; i <= rt; i++)
				smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);

			if (tmap.equals(smap))
				answer++;
			lt++;
		}
		return answer;
	}

	public static int sol1(String s, String t) {
		Map<Character, Integer> tmap = new HashMap<>();
		Map<Character, Integer> smap = new HashMap<>();
		for (char x : t.toCharArray())
			tmap.put(x, tmap.getOrDefault(x, 0) + 1);
		for (int i = 0; i < t.length() - 1; i++)
			smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);

		int answer = 0;
		int lt = 0;
		for (int rt = t.length() - 1; rt < s.length(); rt++) {
			smap.put(s.charAt(rt), smap.getOrDefault(s.charAt(rt), 0) + 1);
			if (tmap.equals(smap))
				answer++;

			smap.put(s.charAt(lt), smap.getOrDefault(s.charAt(lt), 0) - 1);
			if (smap.get(s.charAt(lt)) == 0)
				smap.remove(s.charAt(lt));
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String t = br.readLine();

		System.out.println(sol(s, t));
	}
}
