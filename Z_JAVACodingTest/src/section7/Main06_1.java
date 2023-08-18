package section7;

import java.util.Scanner;

public class Main06_1 {
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

	static int n;
	// 부분집합 출력 배열
	// check[i] = 1 이라면 i+1을 부분집합으로 가지고 있는 것
	static int[] check;

	public static void DFS(int level) {
		if (n == level) {
			for (int i = 0; i < n; i++) {
				if (check[i] != 0)
					System.out.print(i + 1 + " ");
			}
			System.out.println();
			return;
		}

		// positive
		check[level] = 1;
		DFS(level + 1);
		// negative
		check[level] = 0;
		DFS(level + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check = new int[n];
		// level은 0[lv.1]부터 시작해서 n-1[lv.n]까지 탐색
		DFS(0);
		sc.close();
	}
}
