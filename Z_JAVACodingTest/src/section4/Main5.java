package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main5 {
	// 5. K번째 큰 수
	// 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다.
	// 같은 숫자의 카드가 여러장 있을 수 있습니다.
	// 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다.
	// 3장을 뽑을 수 있는 모든 경우를 기록합니다.
	// 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
	// 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고
	// K값이 3이라면 K번째 큰 값은 22입니다.
	// 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
	// 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.

	// 1 2 3 4 5 6
	// 123, 124, 125, 126
	// 134, 135, 136
	// 145, 146
	// 156
	// 234, 235, 236
	// 245, 246
	// 256
	// 345, 346
	// 356
	// 456

	public static int sol(int n, int k, int[] num) {
		// Collections.reverseOrder() : 내림차순 정렬
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
		int answer = -1;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int s = j + 1; s < n; s++)
					set.add(num[i] + num[j] + num[s]);
			}
		}

		if (set.size() < k)
			return answer;
		answer = (int) set.toArray()[k - 1];
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		String[] c = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = Integer.parseInt(c[i]);

		System.out.println(sol(n, k, num));
	}
}
