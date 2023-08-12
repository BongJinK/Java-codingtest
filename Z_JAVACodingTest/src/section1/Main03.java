package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	// ���� �� �ܾ�
	// �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
	// ������� �� �ܾ�� �������� ���е˴ϴ�.
	// ������ ���� ���ĺ����θ� ���� �Ǿ� �ֽ��ϴ�.

	public String solution(String text) {
		StringBuilder answer = new StringBuilder("");

		for (String str : text.split(" ")) {
			if (str.length() > answer.length())
				answer = new StringBuilder(str);
		}
		return answer.toString();
	}

	public static void main(String[] args) throws IOException {

		Main03 t3 = new Main03();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		System.out.println(t3.solution(text));
	}
}
