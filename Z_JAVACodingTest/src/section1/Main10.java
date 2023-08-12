package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
	// ★★★ : 앞에서 순회 1회, 뒤에서 순회 1회
	// 가장 짧은 문자거리
	// 한 개의 문자열 s와 문자 t가 주어지면
	// 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	// 문자열의 길이는 100을 넘지 않는다.

	public int[] solution(String text, char c) {
		int[] arr = new int[text.length()];
		int length = 101;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c)
				length = 0;
			else {
				length++;
				arr[i] = length;
			}
		}

		length = 101;
		for (int i = text.length() - 1; i >= 0; i--) {
			if (text.charAt(i) == c)
				length = 0;
			else {
				length++;
				arr[i] = Math.min(arr[i], length);
			}
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Main10 t10 = new Main10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String text = temp.split(" ")[0];
		char c = temp.split(" ")[1].charAt(0);
		for (int x : t10.solution(text, c))
			System.out.print(x + " ");
		br.close();
	}
}
