package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {
	// 임시반장 정하기
	// 임시로 반장을 정하고 학생들이 서로 친숙해진 후에, 선거를 통해 반장을 선출.
	// 학생 중에서 1학년부터 "[5학년]"까지 지내오면서
	// 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장.
	// 그래서 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표 제작.
	// 예를 들어 학생 수가 5명일 때의 표를 살펴보자
	// 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
	// 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.

	// 5
	// 2 3 1 7 3
	// 4 1 9 6 8
	// 5 5 2 4 4
	// 6 5 2 6 7
	// 8 4 2 2 2

	// i : a학생, j : 반, k : 같은 학년 학생
	public int solution(int n, int[][] arr) {
		int ans = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int[] ck = new int[n];
			int c = 0;
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < n; k++) 
					// a학생의 1~5학년 각각의 같은반 학생 유무 판별
					if (ck[k] == 0 && arr[i][j] == arr[k][j])
						ck[k] = 1;
			}
			for (int k = 0; k < n; k++)
				if (ck[k] == 1)
					c++;
			if (c > cnt) {
				cnt = c;
				ans = i + 1;
			}
		}
		return ans;
	}
	
	// i : a학생, j : b학생, k : 반
	public int sol(int n, int[][] arr) {
		int ans = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int c = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					// a학생과 b학생의 반 비교
					if (arr[i][k] == arr[j][k]) {
						c++;
						break;
					}
				}
			}
			if (c > cnt) {
				cnt = c;
				ans = i + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Main11 t11 = new Main11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][5];

		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().split(" ");
			for (int j = 0; j < 5; j++)
				arr[i][j] = Integer.parseInt(t[j]);
		}

		System.out.println(t11.solution(n, arr));
		br.close();
	}
}
