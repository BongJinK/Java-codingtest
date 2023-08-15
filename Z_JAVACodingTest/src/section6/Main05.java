package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main05 {
	// 5. 중복 확인
	// 현수네 반에는 N명의 학생들이 있습니다.
	// 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서
	// 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
	// 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
	// N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
	// 첫 번째 줄에 자연수 N(5<=N<=100,000)이 주어진다.
	// 두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력된다.
	// 첫 번째 줄에 D 또는 U를 출력한다.

	// 8
	// 20 25 52 30 39 33 43 33

	public static String sol(int n, int[] arr) {
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < n; i++)
			s.add(arr[i]);

		if (s.size() == n)
			return "U";
		return "D";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] tmp = br.readLine().split(" ");

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(tmp[i]);

		System.out.println(sol(n, arr));
		br.close();
	}
}
