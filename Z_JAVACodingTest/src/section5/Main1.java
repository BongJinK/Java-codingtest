package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main1 {
	// 1. 올바른 괄호 [ Stack ]
	// 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	// (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	// 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
	// 첫 번째 줄에 YES, NO를 출력한다.

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
	// 닫는 괄호 일 경우 Stack이 비었는지 우선 확인 후
	// 비어 있지 않다면 *.peek() 이용하여 최근에 들어온 Data의 value 값을 Map에서 확인

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		System.out.println(sol(t));
		br.close();
		solution1(t);
	}

	// 다음 조건들이 모두 성립되는 경우 짝이 맞는 괄호로 판정 됩니다.
	// 문자열 s는 다음과 같은 괄호들로만 구성되어 있습니다. ‘(’ , ‘)’ , ‘{’ , ‘}’ , ‘[’ , ‘]’
	// 열린 괄호는 같은 유형 괄호로 닫아야 합니다.
	// 여는 괄호는 반드시 올바른 순서로 닫아야 합니다.
	// 문자열 `s`가 주어졌을 때, 문자열 `s`가 짝이 맞는 괄호이면 `true`를
	// 짝이 맞지 않는 괄호이면 `false`를 return 하는 함수를 작성하시오.

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
