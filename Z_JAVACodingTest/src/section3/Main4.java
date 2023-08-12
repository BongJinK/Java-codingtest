package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	// 연속 부분수열
	// N개의 수로 이루어진 수열이 주어집니다.
	// 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
	// 만약 N=8, M=6이고 수열이 다음과 같다면
	// 1 2 1 3 1 1 1 2
	// 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
	// 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
	// 수열의 원소값은 1,000을 넘지 않는 자연수이다.

	// sliding window

	public static int sol(int n, int m, List<Integer> list) {
		int cnt = 0, sum = 0;
		int pointer = 0;

		for (int i = 0; i < n; i++) {
			sum += list.get(i);
			if (sum == m) 
				cnt++;
			while (sum >= m)
				sum -= list.get(pointer++);
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nm = br.readLine();
		String text = br.readLine();

		int n = Integer.parseInt(nm.split(" ")[0]);
		int m = Integer.parseInt(nm.split(" ")[1]);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(Integer.parseInt(text.split(" ")[i]));

		System.out.println(sol(n, m, list));
	}
}
