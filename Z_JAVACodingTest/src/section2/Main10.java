package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
	// 봉우리
	// 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
	// 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다.
	// 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
	// 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
	// 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

	//	5
	//	5 3 7 2 3
	//	3 7 1 6 1
	//	7 2 5 3 4
	//	4 3 6 4 1
	//	8 7 3 5 2

	public int solution(int n, int[][] arr) {
		int count = 0;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				int tar = arr[i][j];
				if (tar > arr[i - 1][j] && tar > arr[i][j - 1] && tar > arr[i + 1][j] && tar > arr[i][j + 1])
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		Main10 t10 = new Main10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 2][n + 2];

		for (int i = 1; i < n + 1; i++) {
			String[] t = br.readLine().split(" ");
			for (int j = 1; j < n + 1; j++)
				arr[i][j] = Integer.parseInt(t[j - 1]);
		}

		System.out.println(t10.solution(n, arr));
		br.close();
	}
}