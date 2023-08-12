package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
	// ★★★★★
	// 특정 문자 뒤집기
	// 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	// 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

	public String solution(String text) {
		int lt = 0;
		int rt = text.length() - 1;
		char[] arr = text.toCharArray();

		while (lt < rt) {
			if (!Character.isAlphabetic(arr[lt]))
				lt++;
			else if (!Character.isAlphabetic(arr[rt]))
				rt--;
			else {
				char temp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = temp;
				lt++;
				rt--;
			} 
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) throws IOException {
		Main05 t5 = new Main05();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String test = br.readLine();

		System.out.println(t5.solution(test));
		br.close();
	}	
}
