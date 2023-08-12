package section2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main01 {
	// ū �� ����ϱ�
	// N(1<=N<=100)���� ������ �Է¹޾�,
	// �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.(ù ��° ���� ������ ����Ѵ�)
	// ù �ٿ� �ڿ��� N�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.
	// �ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
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
