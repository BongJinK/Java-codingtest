package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// 3. 삽입 정렬 [ 우측 정렬 : Max값부터 ]
	// 손안의 카드를 정렬하는 방법과 유사하다.
	// 새로운 카드를 기존의 정렬된 카드 사이의 올바른 자리를 찾아 삽입한다.
	// 새로 삽입될 카드의 수만큼 반복하게 되면 전체 카드가 정렬된다.

	// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
	// 정렬하는 방법은 "버블 정렬"입니다.
	// 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
	// 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다.
	// 각 자연수는 정수형 범위 안에 있습니다.
	// 오름차순으로 정렬된 수열을 출력합니다.

	// 6
	// 13 5 11 7 23 15

	public static String sol(int n, int[] arr) {
		StringBuilder str = new StringBuilder("");

		for (int i = 1; i < n; i++) {
			// 삽입대상 : target
			int target = arr[i];
			// i-1까지는 정렬 된 것으로 간주하므로 i-1부터 역순 탐색
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > target)
					arr[j + 1] = arr[j];
				else
					break;
			}
			arr[j + 1] = target;
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
