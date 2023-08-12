package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	// 뒤집은 소수
	// N개의 자연수가 입력되면 각 자연수를 뒤집은 후,
	// 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
	// 예를 들어 32를 뒤집으면 23이고, 23은 소수이다.
	// 그러면 23을 출력한다.
	// 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.
	// 9
	// 32 55 62 20 250 370 200 30 100
	// 23 2 73 2 3

	public String solution(int cnt, String t) {
		StringBuilder str = new StringBuilder();
		String[] temp = t.split(" ");

		for (int i = 0; i < cnt; i++) {
			int tar = Integer.parseInt(new StringBuilder(temp[i]).reverse().toString());
			int c = 2;

			for (int j = 2; j < tar; j++) {
				if (tar % j == 0) {
					c++;
					break;
				}
			}
			if (c == 2 && tar != 1)
				str.append(tar + " ");
		}
		return str.toString();
	}
	
	public static void main(String[] args) throws IOException {
		Main06 t6 = new Main06();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		String t = br.readLine();
		
		System.out.println(t6.solution(cnt, t));
		br.close();
	}
}
