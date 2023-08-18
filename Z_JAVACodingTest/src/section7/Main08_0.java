package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08_0 {
	// 송아지 찾기(BFS : 상태트리탐색)
	// 송아지에는 위치추적기가 달려 있다.
	// 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면
	// 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
	// 송아지는 움직이지 않고 제자리에 있다.
	// 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
	// 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

	// 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다.
	// 직선의 좌표 점은 1부터 10,000까지이다.
	// 점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.

	// 예1
	// 5 14
	// 3

	// 예2
	// 8 3
	// 5
	public static void BFS(int s, int e) {
		int cnt = 0;

		int for1 = 1;
		int for5 = 5;
		int back1 = -1;

		while (s != e) {
			if (s > e)
				s += back1;
			else {
				int f1 = Math.abs(e - (s + for1));
				int f5 = Math.abs(e - (s + for5));

				if (f1 < f5)
					s += for1;
				else
					s += for5;
			}
			cnt++;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] se = br.readLine().split(" ");
		int s = Integer.parseInt(se[0]);
		int e = Integer.parseInt(se[1]);

		BFS(s, e);
		br.close();
	}
}
