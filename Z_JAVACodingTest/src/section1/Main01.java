package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
	// 문자 찾기
	// 한 개의 문자열을 입력받고 특정 문자를 입력받아,
	// 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	// 대소문자를 구분하지 않습니다.
	// 문자열은 영어 알파벳으로만 구성되어 있습니다.

	public int solution(String text, char c) {
		int answer = 0;
		text = text.toUpperCase();
		c = Character.toUpperCase(c);
		
		for (char x : text.toCharArray()) {
			if (x == c)
				answer++;
		}
		return answer;
	}
	
	public int sol(String text, char c) {
		int answer = 0;
		text = text.toUpperCase();
		c = Character.toUpperCase(c);
		
		for (char x : text.toCharArray()) {
			if (x == c)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main01 t = new Main01();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		char c = br.readLine().charAt(0);

		System.out.println(t.solution(text, c));
		br.close();
	}
}
