package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main09 {
	// 숫자만 추출
	// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
	// 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
	// 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
	// 0 ~ 9 : 48~57 [ASCII CODE]
	// Character.isDigit(x)
	
	public String solution(String text) {
		String newText = text.replaceAll("[^0-9]", "");
		int answer = Integer.parseInt(newText);
		if( answer >= 100000000)
			return "";
		return String.valueOf(answer);
	}
	
	public int solution2(String text) {
		return Integer.parseInt(text.replaceAll("[^0-9]", ""));
	}
	
	public static void main(String[] args) throws IOException {
		Main09 t9 = new Main09();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		// text = "g0en2T0s8eSoft";
		System.out.println(t9.solution(text));
		br.close();
	}
}
