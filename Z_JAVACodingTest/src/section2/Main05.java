package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
	// 소수(에라토스테네스 체)
	// 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
	// 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
	// 제한시간은 1초입니다.
	// 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

	public int solution(int len) {
		int[] arr = new int[len + 1];
		int count = 0;

		for (int i = 2; i <= len; i++) {
			if (arr[i] == 0) {
				count++;
				for (int j = i; j <= len; j += i) {
					if (arr[j] == 0)
						arr[j] = 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Main05 t5 = new Main05();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());
		
		System.out.println(t5.solution(len));
		br.close();
	}
}
