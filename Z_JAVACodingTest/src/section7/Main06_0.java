package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_0 {
	// 부분집합 구하기(DFS)
	// 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의
	// 부분집합을 모두 출력하는 프로그램을 작성하세요.
	// 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
	// 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다.
	// 단 공집합은 출력하지 않습니다.

	// 3
	// 1 2 3
	// 1 2
	// 1 3
	// 1
	// 2 3
	// 2
	// 3

	public static void dfs(int n) {
		int[] t = new int[n];
		test(n, 0, t);
	}

	public static void test(int n, int i, int[] t) {
		if (n == i) {
			StringBuilder str = new StringBuilder("");

			for (int s = 0; s < n; s++) {
				if (t[s] != 0)
					str.append(t[s] + " ");
			}
			if (!str.toString().equals(""))
				System.out.println(str.toString());
			return;
		}

		// positive
		t[i] = i + 1;
		test(n, i + 1, t);
		// negative
		t[i] = 0;
		test(n, i + 1, t);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		dfs(n);
		br.close();
	}
}
