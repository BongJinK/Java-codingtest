package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	// ������ �Ҽ�
	// N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ ��,
	// �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�.
	// �׷��� 23�� ����Ѵ�.
	// �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�. ù �ڸ������� ���ӵ� 0�� �����Ѵ�.
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
