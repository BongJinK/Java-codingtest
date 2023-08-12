package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main08 {
	// 등수구하기
	// N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
	// 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
	// 즉, 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

	// 5
	// 87 89 92 100 76
	// 4 3 2 1 5

	public String solution(int cnt, ArrayList<Integer> arr) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < cnt; i++) {
			int grade = 1;
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(j) > arr.get(i))
					grade++;
			}
			str.append(grade + " ");
		}

		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main08 t8 = new Main08();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		String t = br.readLine();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < cnt; i++) {
			arr.add(Integer.parseInt(t.split(" ")[i]));
		}
		
		System.out.println(t8.solution(cnt, arr));
		br.close();
	}
}
