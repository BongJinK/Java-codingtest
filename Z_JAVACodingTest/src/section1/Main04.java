package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
	// 단어 뒤집기
	// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	// 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
	// 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다.
	// 단어는 영어 알파벳으로만 구성되어 있습니다.

	public void solution(String[] arr) {
		for (String str : arr) {
			String answer = new StringBuilder(str).reverse().toString();
			System.out.println(answer);
		}
	}

	public static void main(String[] args) throws IOException {
		Main04 t4 = new Main04();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];

		for (int i = 0; i < n; i++)
			arr[i] = br.readLine();

		t4.solution(arr);

		br.close();
	}
}
