package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07 {

	// 회문 문자열
	// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	// 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력
	// 하는 프로그램을 작성하세요.
	// 단 회문을 검사할 때 대소문자를 구분하지 않습니다

	public String solution(String text) {
		String temp = new StringBuilder(text).reverse().toString();
		if (text.equalsIgnoreCase(temp))
			return "YES";
		return "NO";
	}

	public static void main(String[] args) throws IOException {
		Main07 t7 = new Main07();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		System.out.println(t7.solution(text));

		br.close();
	}
	
	public String solution2(String text) {
		String answer = "YES";
		int len = text.length();
		text = text.toUpperCase();
		
		for(int i = 0; i < len/2; i++) {	
			if( text.charAt(i) != text.charAt(len-i-1)) {
				answer = "NO";
				break;
			}
		}
		return answer;
	}
}
