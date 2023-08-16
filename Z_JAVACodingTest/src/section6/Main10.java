package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10 {
	// ★★★★★★★★★★★★★★★★★★★
	// 10. 마구간 정하기(결정알고리즘)
	// N개의 마구간이 수직선상에 있습니다.
	// 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며,
	// 마구간 간에 좌표가 중복되는 일은 없습니다.

	// 현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다.
	// 각 마구간에는 한 마리의 말만 넣을 수 있고,
	// 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.

	// C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는
	// 그 최대값을 출력하는 프로그램을 작성하세요.

	// 첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
	// 둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
	// 첫 줄에 가장 가까운 두 말의 "최대 거리"를 출력하세요. distinct

	// 5 3
	// 1 2 8 4 9
	// 3

	public static int sol(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n - 1];

		while (lt <= rt) {
			int size = (lt + rt) / 2;

			if (checkSize(arr, size) == c) {
				answer = size;
				lt = size + 1;
			} else if (checkSize(arr, size) > 3)
				lt = size + 1;
			else
				rt = size - 1;
		}
		return answer;
	}

	public static int checkSize(int[] arr, int size) {
		int lastPoint = arr[0];
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (lastPoint + size <= arr[i]) {
				lastPoint = arr[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nc = br.readLine().split(" ");
		int n = Integer.parseInt(nc[0]);
		int c = Integer.parseInt(nc[1]);

		int[] arr = new int[n];
		String[] tmp = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(tmp[i]);

		System.out.println(sol(n, c, arr));
		br.close();
	}
}
