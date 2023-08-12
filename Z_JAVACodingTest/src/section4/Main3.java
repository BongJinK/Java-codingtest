package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
	// 매출액의 종류
	// 현수아빠는 현수에게 N일 동안의 매출기록을 주고
	// 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했습니다.
	// 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
	// 20 12 20 10 23 17 10
	// 각 연속 4일간의 구간의 매출종류는
	// 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
	// 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
	// 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
	// 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
	// N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
	// 매출액의 종류를 출력하는 프로그램을 작성하세요.
	// 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
	// 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
	// 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.

	// 7 4
	// 20 12 20 10 23 17 10
	// >> 3 4 4 3

	public static String sol(int n, int k, String[] s) {
		StringBuilder str = new StringBuilder("");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < k - 1; i++)
			map.put(s[i], map.getOrDefault(s[i], 0) + 1);

		int lt = 0;
		int rt = k - 1;
		while (rt < n) {
			map.put(s[rt], map.getOrDefault(s[rt], 0) + 1);
			str.append(map.size() + " ");

			map.put(s[lt], map.get(s[lt]) - 1);
			if (map.get(s[lt]) == 0)
				map.remove(s[lt]);
			lt++;
			rt++;
		}
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		String[] s = br.readLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		System.out.println(sol(n, k, s));
	}
}
