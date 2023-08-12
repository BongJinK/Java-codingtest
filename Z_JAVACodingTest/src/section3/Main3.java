package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
	// 최대 매출
	// N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
	// 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다.
	// 이때 K=3이면
	// 12 15 [11 20 25] 10 20 19 13 15
	// 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
	// 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
	// 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

	public static int sol(int n, int day, List<Integer> list) {
		int max = 0;
		for (int i = 0; i < day; i++)
			max += list.get(i);

		int answer = max;
		for (int i = day; i < n; i++) {
			max += list.get(i) - list.get(i - day);
			answer = Math.max(answer, max);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nk = br.readLine();
		String sales = br.readLine();

		int n = Integer.parseInt(nk.split(" ")[0]);
		int day = Integer.parseInt(nk.split(" ")[1]);

		List<Integer> list = new ArrayList<>();
		for (String x : sales.split(" "))
			list.add(Integer.parseInt(x));

		System.out.println(sol(n, day, list));
	}
}
