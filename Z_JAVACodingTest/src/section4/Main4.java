package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main4 {
	// 4. 모든 아나그램 찾기
	// S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
	// 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
	// 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
	// S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
	// S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

	// bacaAacba
	// 012345678 : 9
	// abc
	// 3
	// sol 보다 sol1이 더 빠름

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
