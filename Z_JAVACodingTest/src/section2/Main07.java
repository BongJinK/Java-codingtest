package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07 {
	// �������
	// OX ������ �°ų� Ʋ�� �� ����� ���� ������ ������ ���Ѵ�.
	// ���� ���� OX ������ ������� ���迡�� ���������� ���� ������ ��쿡�� �������� �ֱ� ���ؼ�
	// ������ ���� ���� ����� �ϱ� �� �Ͽ���. 1�� ������ �´� ��쿡�� 1������ ����Ѵ�.
	// ���� ������ ���ؼ��� ���� Ʋ���ٰ� ���� �´� ó�� ������ 1������ ����Ѵ�.
	// ����, �������� ������ ���� �´� ��쿡�� �� ��° ������ 2��, �� ��° ������ 3��,
	// ..., K��° ������ K������ ����Ѵ�. Ʋ�� ������ 0������ ����Ѵ�.
	// ���� ���, �Ʒ��� ���� 10 ���� OX �������� ���� ���� ������ ��쿡�� 1�� ǥ���ϰ�,
	// Ʋ�� ��쿡�� 0���� ǥ���Ͽ��� ��, ���� ����� �Ʒ� ǥ�� ���� ���Ǿ�,
	// �� ������ 1+1+2+3+1+2=10 ���̴�.

	// 10
	// 1 0 1 1 1 0 0 1 1 0
	// 1 0 1 2 3 0 0 1 2 0
	// 10��

	public int solution(int cnt, String t) {
		int a = 0;
		String[] arr = t.split(" ");

		int p = 0;
		for (int i = 0; i < cnt; i++) {
			if (arr[i].equals("0"))
				p = 0;
			else {
				p++;
				a += p;
			}
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		Main07 t7 = new Main07();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		String t = br.readLine();
		
		System.out.println(t7.solution(cnt, t));
		br.close();
	}
}
