package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
	// 피보나치 수열
	// 1) 피보나치 수열을 출력한다.
	// 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
	// 2) 입력은 피보나치 수열의 총 항의 수 이다.
	// 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

	public int[] solution(int seq) {
		int[] arr = new int[seq];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < seq; i++)
			arr[i] = arr[i - 2] + arr[i - 1];
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Main04 t4 = new Main04();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int seq = Integer.parseInt(br.readLine());

		for (Integer x : t4.solution(seq))
			System.out.print(x + " ");
		br.close();
	}
}
