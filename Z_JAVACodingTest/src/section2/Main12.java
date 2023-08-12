package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12 {
	// ★★★★★★★★
	// 멘토링
	// 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
	// 멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
	// 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
	// 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면,
	// A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다. [★★★★★★★★]
	// M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.

	// 첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.
	// 두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다.
	// 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
	// 만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면
	// 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.

	// 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.

	// 4[학생 수] 3[테스트 수]
	// 3 4 1 2
	// 4 3 2 1
	// 3 1 4 2
	// 3
	// 3,1 3,2 4,2
	// 1,6 2,6 3,1 3,2 3,6 4,2 4,6 5,6

	// i+1 : 멘토학생번호 , j+1 : 멘티학생번호
	// k : m번시행한 시험
	// s : 시험 등수 확인

	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int cnt = 0;
				if (i == j)
					continue;
				for (int k = 0; k < m; k++) {
					int mento = 0, menti = 0;
					for (int s = 0; s < n; s++) {
						if (arr[k][s] == i + 1)
							mento = s;
						if (arr[k][s] == j + 1)
							menti = s;
					}
					// 인덱스 비교 멘토의 등수가 멘티의 등수보다 높아야하므로 ex) 1등, 3등
					if (mento < menti)
						cnt++;
				}
				if (cnt == m)
					answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main12 t12 = new Main12();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String c = br.readLine();
		int n = Integer.parseInt(c.split(" ")[0]);
		int m = Integer.parseInt(c.split(" ")[1]);
		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			String[] t = br.readLine().split(" ");
			for (int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(t[j]);
		}

		System.out.println(t12.solution(n, m, arr));
		br.close();
	}
}
