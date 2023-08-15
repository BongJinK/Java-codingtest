package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
	// 1. 선택 정렬 [ 좌측 정렬 : Min값부터 ]
	// 최솟값 찾아 index 0 부터 n까지 차례대로 정렬

	// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
	// 정렬하는 방법은 "선택정렬"입니다.
	// 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
	// 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다.
	// 각 자연수는 정수형 범위 안에 있습니다.
	// 오름차순으로 정렬된 수열을 출력합니다.

	// 6
	// 13 5 11 7 23 15

	public static String sol(int n, int[] arr) {
		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[idx] > arr[j])
					idx = j;
			}
			if (idx != -1) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
		}

		for (int x : arr)
			str.append(x + " ");
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] t = br.readLine().split(" ");

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(t[i]);

		System.out.println(sol(n, arr));
		br.close();
	}
}
