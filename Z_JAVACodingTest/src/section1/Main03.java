package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// 문장 속 단어
	// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
	// 문장속의 각 단어는 공백으로 구분됩니다.
	// 문장은 영어 알파벳으로만 구성 되어 있습니다.

	public String solution(String text) {
		StringBuilder answer = new StringBuilder("");

		for (String str : text.split(" ")) {
			if (str.length() > answer.length())
				answer = new StringBuilder(str);
		}
		return answer.toString();
	}

	public static void main(String[] args) throws IOException {

		Main03 t3 = new Main03();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		System.out.println(t3.solution(text));
	}
}
