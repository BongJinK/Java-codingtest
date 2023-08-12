package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	// 보이는 학생
	// 선생님이 N명의 학생을 일렬로 세웠습니다.
	// 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
	// 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
	// (어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않습니다.)
	// 첫 줄에 정수 N(5<=N<=100,000)이 입력된다.
	// 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
	// 선생님이 볼 수 있는 최대학생수를 출력한다.
	// 8
	// 130 135 148 140 145 150 150 153
	// 5

	public String solution(int length, int[] arr) {
		int count = 1, standard = arr[0];
		for (int i = 1; i < length; i++) {
			if (standard < arr[i]) {
				count++;
				standard = arr[i];
			}
		}
		return String.valueOf(count);
	}

	public static void main(String[] args) throws IOException {
		Main02 t2 = new Main02();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String t = br.readLine();
		int[] arr = new int[length];
		String[] temp = t.split(" ");
		for (int i = 0; i < arr.length; i++) 
			arr[i] = Integer.parseInt(temp[i]);
		
		System.out.println(t2.solution(length, arr));
		br.close();
	}
}
