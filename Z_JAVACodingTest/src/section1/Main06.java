package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	// 중복문자제거
	// 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
	// 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

	public String solution(String text) {
		String answer = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.indexOf(text.charAt(i)) == i)
				answer += text.charAt(i);
		}
		return answer;
	}

//	public String solution(String text) {
//		String answer = "";
//		for(char x : text.toCharArray()) {
//			if( !answer.contains(String.valueOf(x)) )
//				answer += x;
//		}
//		return answer;
//	}

	public static void main(String[] args) throws IOException {
		Main06 t6 = new Main06();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		System.out.println(t6.solution(t));
		br.close();
	}
}
