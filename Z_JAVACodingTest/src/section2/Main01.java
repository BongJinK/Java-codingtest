package section2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main01 {
	// 큰 수 출력하기
	// N(1<=N<=100)개의 정수를 입력받아,
	// 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.(첫 번째 수는 무조건 출력한다)
	// 첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
	// 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
	// 6
	// 7 3 9 5 6 12
	// 7 9 6 12

	public String solution(int length, String t) {
		StringBuilder str = new StringBuilder(t.substring(0, 1));

		String[] aa = t.split(" ");
		int start = Integer.parseInt(aa[0]);
		for (int i = 1; i < aa.length; i++) {
			if (Integer.parseInt(aa[i]) > start)
				str.append(" " + aa[i]);
			start = Integer.parseInt(aa[i]);
		}

		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		Main01 t1 = new Main01();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(br.readLine());
		String element = br.readLine();

		bw.write(t1.solution(length, element));
		bw.flush();
		bw.close();
		br.close();

	}
}
