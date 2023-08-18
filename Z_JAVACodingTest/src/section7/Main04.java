package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
	// 피보나치 수열 [ 메모이제이션 ]
	// 1) 피보나키 수열을 출력한다.
	// 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
	// 2) 입력은 피보나치 수열의 총 항의 수 이다.
	// 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
	// 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
	// 첫 줄에 피보나치 수열을 출력합니다.

	// 10
	// 1 1 2 3 5 8 13 21 34 55

	// 시간복잡도 : O(n)
	// 공간복잡도 : O(n)
	
	// for 문 사용해서 피보나치 수열 배열하는 것이 재귀로 풀이하는 것 보다 좋다
	// 재귀는 함수 하나 호출될 때 마다 stack에 frame이 쌓여서 메모리가 많이 생김
	// for문은 함수 하나로 frame이 한개만 생김

	public static void DFS(int n, int i, int j) {
		if (n == 0)
			return;
		System.out.print(i + j + " ");
		DFS(n - 1, j, i + j);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		DFS(n, 1, 0);
		br.close();
	}
}
