package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2 {
	// 2. 괄호문자제거
	// 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고
	// 남은 문자만 출력하는 프로그램을 작성하세요.
	// 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
	// 남은 문자만 출력한다.

	// Stack 미사용
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

	// Stack 사용
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
