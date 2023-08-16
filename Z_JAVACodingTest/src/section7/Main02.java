package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	// 재귀함수를 이용한 이진수 출력
	// 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
	// 단 재귀함수를 이용해서 출력해야 합니다.
	// 첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
	// 첫 번째 줄에 이진수를 출력하세요.

	// 11
	// 1011

	public static void DFS(int n) {
		if (n == 0)
			return;

		DFS(n / 2);
		System.out.print(n % 2);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		DFS(n);
		br.close();
	}
}
