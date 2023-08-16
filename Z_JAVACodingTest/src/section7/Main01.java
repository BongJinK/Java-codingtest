package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
	// 재귀함수
	// 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
	// 첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.
	// 첫째 줄에 출력한다.

	// 3
	// 1 2 3
	
	// 재귀함수는 stack frame을 사용한다.
	// stack framed은 호출 메서드의 정보를 포함한다.
	// ㄴ 매개변수, 지역변수, 복귀주소[처음 DFS(n)이 호출되는 위치]
	
	// stack => D(n) D(n-1) D(n-2) .... D(1) 로 쌓인다.
	// 출력은 D(1) D(2) .... D(n-1) D(n) 순서로 출력
	// 그러므로 DFS(n-1);
	// 위에 print하면 3 2 1 로 출력되고 
	// 아래에 print하면 1 2 3 으로 출력 된다.
	
	public static void DFS(int n) {
		if( n == 0)
			return;
		else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		DFS(n);
		br.close();
	}

}
