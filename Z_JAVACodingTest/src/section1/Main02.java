package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	// 대소문자 변환
	// 대문자와 소문자가 같이 존재하는 문자열을 입력받아,
	// 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
	// 문자열은 영어 알파벳으로만 구성되어 있습니다.
	// solution이 solution1 보다 6ms 더 빠름

	public String solution1(String text) {
		String answer = "";
		for (char x : text.toCharArray()) {
			if (x >= 65 && x <= 90)
				answer += Character.toLowerCase(x);
			else if (x >= 97 && x <= 122) {
				answer += Character.toUpperCase(x);
			}
		}
		return answer;
	}

	public String solution(String text) {
		String ans = "";
		for (char x : text.toCharArray()) {
			if (Character.isUpperCase(x))
				ans += Character.toLowerCase(x);
			else
				ans += Character.toUpperCase(x);
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Main02 t = new Main02();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		System.out.println(t.solution(text));
		// System.out.println(solution(text));

		br.close();
	}
}
