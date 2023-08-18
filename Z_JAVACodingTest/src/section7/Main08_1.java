package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main08_1 {
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

	static int level;
	static int[] distinct = { 1, -1, 5 };
	static int[] check;
	static Queue<Integer> Q = new LinkedList<>();

	public static int BFS(int s, int e) {
		check = new int[10001];
		check[s] = 1;
		Q.offer(s);
		level = 0;

		while (!Q.isEmpty()) {
			int len = Q.size();

			for (int i = 0; i < len; i++) {
				int x = Q.poll();

				for (int j = 0; j < 3; j++) {
					int nx = x + distinct[j];
					if (nx == e)
						return level + 1;
					if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
						check[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			level++;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] se = br.readLine().split(" ");
		int s = Integer.parseInt(se[0]);
		int e = Integer.parseInt(se[1]);

		System.out.println(BFS(s, e));
		br.close();
	}
}
