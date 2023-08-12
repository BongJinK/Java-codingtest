package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
	// 연속된 자연수의 합
	// N입력으로 양의 정수 N이 입력되면
	// 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
	// 만약 N=15이면
	// 7+8=15
	// 4+5+6=15
	// 1+2+3+4+5=15

	public static int sol(int target) {
		int sum = 0, p = 1, cnt = 0;
		int max = target / 2 + 1;

		for (int i = 1; i <= max; i++) {
			sum += i;
			while (sum > target)
				sum -= p++;
			if (sum == target)
				cnt++;
		}
		return cnt;
	}

	// 수학적인 방법 ★★★★★★
	public static int solution(int target) {
		int answer = 0;
		int cnt = 1;
		target--;
		while (target > 0) {
			cnt++;
			target -= cnt;
			if (target % cnt == 0)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		System.out.println(sol(target));
	}
}
