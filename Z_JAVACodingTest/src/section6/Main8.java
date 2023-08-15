package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main8 {
	// 8. 이분검색
	// 임의의 N개의 숫자가 입력으로 주어집니다.
	// N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
	// 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요.
	// 단, 중복값은 존재하지 않습니다.
	// 첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
	// 두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.
	// 첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.

	// 8 32
	// 23 87 65 12 57 32 99 81

	// Collections.reverse(Arrays.asList(arr)); 오름차순 정렬 뒤집기

	public static int sol(int n, int m, int[] arr) {
		Arrays.sort(arr);
		int answer = -1;
		int lt = 0;
		int rt = n - 1;

		while (lt < rt) {
			int idx = (lt + rt) / 2;

			if (arr[idx] == m) {
				answer = idx + 1;
				break;
			}else if (arr[idx] > m)
				rt = idx;
			else
				lt = idx;
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		int[] arr = new int[n];
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(temp[i]);

		System.out.println(sol(n, m, arr));
		br.close();
	}
}
