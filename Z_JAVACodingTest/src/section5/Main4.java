package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4 {

	// 4. 후위식 연산(postfix)
	// 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
	// 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
	// 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
	// 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
	// 연산한 결과를 출력합니다.
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
				if (x == '+')
					stack.push(n1 + n2);
				else if (x == '-')
					stack.push(n1 - n2);
				else if (x == '*')
					stack.push(n1 * n2);
				else if (x == '/')
					stack.push(n1 / n2);
			}
		}
		ans = stack.pop();
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		System.out.println(sol(t));
		br.close();
	}
}
