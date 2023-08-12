package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main08 {
	// ������ϱ�
	// N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
	// ��, ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.

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
