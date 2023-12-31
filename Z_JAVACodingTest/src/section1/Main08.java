package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08 {

	// 유효한 팰린드롬
	// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
	// 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	// 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
	// 알파벳 이외의 문자들의 무시합니다.
	// ^ : not
	// [a-z] : 알파벳 소문자
	// [A-Z] : 알파벳 대문자
	// [0-9] : 숫자
	// [ㄱ-ㅎ ㅏ-ㅣ 가-힣] : 한글
	// 0 ~ 9 : 48~57 [ASCII CODE]

	public String solution(String text) {
		text = text.replaceAll("[^a-zA-Z]", "");
		String test = new StringBuilder(text).reverse().toString();
		if (text.equalsIgnoreCase(test))
			return "YES";
		return "NO";
	}

	public static void main(String[] args) throws IOException {
		Main08 t8 = new Main08();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		text = "found7, time: study; Yduts; emit, 7Dnuof";
		System.out.println(t8.solution(text));
		br.close();
	}
}
