package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {
	// 문자열 압축
	// 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우,
	// 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
	// 단 반복횟수가 1인 경우 생략합니다.
	// 문자열의 길이는 100을 넘지 않는다.

	public String solution(String text) {
		StringBuilder str = new StringBuilder();
		char c = text.charAt(0);
		int count = 0;

		for (char x : text.toCharArray()) {
			if (x == c)
				count++;
			else {
				str.append(c);
				if (count != 1)
					str.append(count);
				c = x;
				count = 1;
			}
		}
		str.append(c);
		if (count != 1)
			str.append(count);
		return str.toString();
	}
	
	public String solution2(String text) {
		StringBuilder str = new StringBuilder("");
		text = text + " "; // 와웅~~
		int cnt = 1;
		for(int i = 0; i < text.length()-1; i++) {
			if( text.charAt(i) == text.charAt(i+1)) 
				cnt++;
			else {
				str.append(text.charAt(i));
				if( cnt != 1)
					str.append(cnt + "");
				cnt = 1;
			}
		}
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main11 t11 = new Main11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		System.out.println(t11.solution(text));
		br.close();
	}
}
