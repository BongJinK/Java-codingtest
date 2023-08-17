package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// 팩토리얼
	// 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
	// 예를 들어 5! = 5*4*3*2*1=120입니다.
	// 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
	// 첫 번째 줄에 N팩토리얼 값을 출력합니다.

	// 5
	// 120

	// 재귀함수 - 팩토리얼 : Stack Frame, DFS : 복습 必
	public static int DFS(int n) {
		if (n == 1)
			return 1;
		return n * DFS(n - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(DFS(n));
		br.close();
	}
}
